package com.chalapathi.test4;


// Parent class
class Animal1 {
    // Overridden method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog that extends Animal
class Dog1 extends Animal1 {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class Cat that extends Animal
class Cat1 extends Animal1 {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism1 {
    public static void main(String[] args) {
        // Reference variable of Animal class referring to a Dog object
        Animal1 myAnimal = new Dog1();
        myAnimal.sound();  // Output: Dog barks

        // Reference variable of Animal class referring to a Cat object
        myAnimal = new Cat1();
        myAnimal.sound();  // Output: Cat meows
    }
}


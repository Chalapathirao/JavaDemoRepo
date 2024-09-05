package com.chalapathi.test1;

class Animal1 {
    // Overridden method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    // Overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    // Overriding method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal1 animal;  // Superclass reference

        animal = new Dog1();  // Reference to subclass Dog
        animal.sound();  // Output: Dog barks

        animal = new Cat1();  // Reference to subclass Cat
        animal.sound();  // Output: Cat meows
    }
}

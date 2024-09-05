package com.chalapathi.test1;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class UpcastingExample2 {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting: Dog to Animal
        animal.makeSound();  // Calls Animal's method

        // animal.bark();  // Compilation error: Animal reference doesn't have access to bark()
    }
}

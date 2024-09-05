package com.chalapathi.test1;

public class DowncastingExample1 {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        animal.makeSound();  // Output: Animal makes a sound

        // Downcasting with explicit cast
        if (animal instanceof Dog) {  // Checking if `animal` is of type Dog
            Dog dog = (Dog) animal;  // Downcasting: Animal to Dog
            dog.bark();  // Now it works
        }
    }
}


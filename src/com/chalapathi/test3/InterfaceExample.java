package com.chalapathi.test3;


interface Animal1 {
    // Abstract method
    void sound();  // Methods are public and abstract by default

    // Default method
    default void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 implements Animal1 {
    // Implementing the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Instantiating class implementing the interface
        dog.sound();  // Output: The dog barks.
        dog.eat();    // Output: This animal eats food.
    }
}


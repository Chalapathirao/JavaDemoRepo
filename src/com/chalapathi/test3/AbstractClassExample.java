package com.chalapathi.test3;

 abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Instantiating subclass
        dog.sound();  // Output: The dog barks.
        dog.eat();    // Output: This animal eats food.
    }
}


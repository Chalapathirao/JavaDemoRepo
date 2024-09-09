package com.chalapathi.test4;

// Interface
interface Animal {
    void eat();  // Abstract method
    void sleep();  // Abstract method
}

// Implementing the interface
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();   // Calls the implemented method in Cat class
        cat.sleep(); // Calls the implemented method in Cat class
    }
}


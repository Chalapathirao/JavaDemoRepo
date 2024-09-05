package com.chalapathi.test2;

// Abstract class
abstract class Vehicle {
    abstract void start();  // Abstract method

    void stop() {  // Concrete method
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Calls the implemented method in Car class
        myCar.stop();   // Calls the concrete method in Vehicle class
    }
}


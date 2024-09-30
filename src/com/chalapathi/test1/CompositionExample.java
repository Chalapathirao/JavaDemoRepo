package com.chalapathi.test1;

class Engine {
    String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }
}

class Car {
    String carModel;
    Engine engine;

    public Car(String carModel, String engineType) {
        this.carModel = carModel;
        this.engine = new Engine(engineType); // Composition: Engine is part of Car
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model S", "Electric");
        System.out.println("Car: " + car.carModel + " with engine type: " + car.engine.engineType);
    }
}


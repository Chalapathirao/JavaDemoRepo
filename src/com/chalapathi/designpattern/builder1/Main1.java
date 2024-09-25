package com.chalapathi.designpattern.builder1;

class Car {
    private String engine;
    private int wheels;
    private boolean airbags;
    private boolean gps;

    private Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.wheels = carBuilder.wheels;
        this.airbags = carBuilder.airbags;
        this.gps = carBuilder.gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", airbags=" + airbags +
                ", gps=" + gps +
                '}';
    }

    public static class CarBuilder{
        // Required parameters
        private String engine;
        private int wheels;

        // Optional parameters
        private boolean airbags;
        private boolean gps;

        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder airbags(boolean airbags) {
            this.airbags = airbags;
            return this;
        }

        public CarBuilder gps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build(){
            return  new Car(this);
        }
    }

}

public class Main1 {
    public static void main(String[] args) {
        Car sportsCar = new Car.CarBuilder("V8", 4)
                .airbags(true)
                .gps(true).build();

        Car familyCar = new Car.CarBuilder("V6", 4)
                .airbags(true)
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}

package com.chalapathi.systemdesign.lsp;

import java.util.ArrayList;
import java.util.List;

public class LspTest1 {
    public static void main(String args[]) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle("Honda pulser"));
        vehicleList.add(new Car("tata car"));
        checkEnginestatus(vehicleList);
    }

     static void checkEnginestatus(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.name+" has "+vehicle.hasEngine().toString());
        }
    }
}

 class Vehicle {
    String name;

     public Vehicle(String name) {
         this.name = name;
     }

     public Integer getNumberOfWheels(){
        return 2;
    }

    public Boolean hasEngine(){
        return true;
    }
}

 class MotorCycle extends Vehicle {
     public MotorCycle(String name) {
         super(name);
     }
     // Inherits getNumberOfWheels() and hasEngine()
}

 class Car extends Vehicle {
     public Car(String name) {
         super(name);
     }

     @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

package com.chalapathi.systemdesign.lsp;

import java.util.ArrayList;
import java.util.List;

public class LspSolutionTest {
    public static void main(String[] args) {
        List<Vechile1> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle1("Honda pulser"));
        vehicleList.add(new Car1("tata car"));
        vehicleList.add(new Bicycle1("atlas bicycle"));
        checkEnginestatus1(vehicleList);
    }

    static void checkEnginestatus1(List<Vechile1> vehicleList) {
        for (Vechile1 vehicle : vehicleList) {
            System.out.println(vehicle.name+" has "+vehicle.hasWheels().toString());
        }
    }
}

class Vechile1{
    public String name;
    public  Vechile1(String name){
        this.name = name;
    }
    public Integer hasWheels(){
        return 2;
    }

}

class EngineVechile extends Vechile1 {

    public EngineVechile(String name) {
        super(name);
    }

    public Boolean hasEngine(){
        return Boolean.TRUE;
    }
}

class Car1 extends EngineVechile {
    public  Car1(String name){
        super(name);
    }

    @Override
    public Integer hasWheels(){
        return 4;
    }
}

class MotorCycle1 extends EngineVechile{
    public  MotorCycle1(String name){
        super(name);
    }
}

class Bicycle1 extends Vechile1{
    public  Bicycle1(String name){
        super(name);
    }

}

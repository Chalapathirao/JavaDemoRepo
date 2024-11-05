package com.chalapathi.systemdesign.lsp;

import java.util.ArrayList;
import java.util.List;

import static com.chalapathi.systemdesign.lsp.LspTest1.checkEnginestatus;

public class LspProblemTest {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotorCycle("Honda pulser"));
        vehicleList.add(new Car("tata car"));
        vehicleList.add(new Bicycle("atlas bicycle"));
        checkEnginestatus(vehicleList);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public Boolean hasEngine() {
        throw new AssertionError("There is no engine!");
        //return null;
        //return Boolean.FALSE;
    }
}
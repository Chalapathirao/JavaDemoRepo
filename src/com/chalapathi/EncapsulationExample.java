package com.chalapathi;

public class EncapsulationExample {
    // Private data members
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) {  // Simple validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        var encapsulationExample  = new EncapsulationExample();
        encapsulationExample.age = 10;
        encapsulationExample.setAge(55);
        System.out.println(encapsulationExample.getAge());
    }
}


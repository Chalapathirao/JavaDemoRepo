package com.chalapathi.test3;

class Address1 implements Cloneable {
    String city;

    Address1(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy of Address
    }
}

class Person1 implements Cloneable {
    String name;
    Address1 address;

    Person1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person1 cloned = (Person1) super.clone(); // Shallow copy of Person
        cloned.address = (Address1) address.clone(); // Deep copy of Address
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) {
        Address1 address = new Address1("New York");
        Person1 person1 = new Person1("Alice", address);

        try {
            System.out.println("Person 1's city: " + person1.address.city);
            Person1 person2 = (Person1) person1.clone(); // Deep copy of person1
            // Change the city in the cloned object
            person2.address.city = "Los Angeles";

            System.out.println("Person 1's city: " + person1.address.city); // Outputs: New York
            System.out.println("Person 2's city: " + person2.address.city); // Outputs: Los Angeles
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

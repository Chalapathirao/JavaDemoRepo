package com.chalapathi.test3;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Creates a shallow copy
    }
}

public class ShallowCopyExample1 {
    public static void main(String[] args) {
        Address address = new Address("New York");
        Person person1 = new Person("Alice", address);

        try {
            System.out.println("Person 1's city: " + person1.address.city);
            Person person2 = (Person) person1.clone(); // Shallow copy of person1
            // Change the city in the cloned object
            person2.address.city = "Los Angeles";

            System.out.println("Person 1's city: " + person1.address.city); // Outputs: Los Angeles
            System.out.println("Person 2's city: " + person2.address.city); // Outputs: Los Angeles
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

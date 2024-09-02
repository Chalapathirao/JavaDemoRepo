package com.chalapathi;

public class PassByReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println(person.getName()); // Output: Alice
        System.out.println(person.getAge()); // Output: 30

        modifyPerson(person);
        System.out.println(person.getName()); // Output: Bob
        System.out.println(person.getAge()); // Output: 40
    }

    public static void modifyPerson(Person p) {
        p.setName("Bob");
        p.setAge(40);
    }
}



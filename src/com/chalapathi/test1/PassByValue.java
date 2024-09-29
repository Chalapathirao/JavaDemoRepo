package com.chalapathi.test1;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class PassByValue {
    public static void main(String[] args) {
        int a = 5;
        String str = "hello";
        System.out.println("a: " + a+", str: "+str);
        modifyPrimitive(a, str);
        System.out.println("After modifyPrimitive: a: " + a+", str: "+str);
        System.out.println();

        Person person = new Person("John");
        System.out.println("Before calling: " + person.name);  // "Doe"
        modifyObject(person);  // Passes a copy of the reference
        System.out.println("After modifyObject: " + person.name);  // "Doe"

        System.out.println();
        Person person1 = new Person("John");
        System.out.println("Before calling: " + person1.name);
        changeReference(person1);  // Passes a copy of the reference
        System.out.println("After changeReference: " + person1.name);  // "John"
    }

    static void modifyPrimitive(int a, String str) {
        a = 67;
        str = "modified";
        System.out.println("Inside modifyPrimitive: a: " + a+", str: "+str);
    }

    public static void modifyObject(Person p) {
        p.name = "Doe";  // Modifies the object via the reference
    }

    public static void changeReference(Person p) {
        p = new Person("Doe");  // Reassigns the reference to a new object, but this does not affect the original reference
        System.out.println("Inside changeReference: " + p.name);  // "Doe"
    }

}

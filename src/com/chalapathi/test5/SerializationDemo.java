package com.chalapathi.test5;

import java.io.*;

// Step 1: Create a class that implements Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L;  // Unique ID for serialization

    private String name;
    private int age;
    private transient String password;  // transient field will not be serialized

    // Constructor
    public Student(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Alice", 22, "mySecretPassword");
        String filename = "student.ser";

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(student);
            System.out.println("Serialization Successful: " + student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



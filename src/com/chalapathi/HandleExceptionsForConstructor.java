package com.chalapathi;


public class HandleExceptionsForConstructor {
    private String name;
    private int age;

    // Constructor with exception handling
    public HandleExceptionsForConstructor(String name, int age) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than or equal to zero.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            // Attempt to create a Person object with invalid data
            HandleExceptionsForConstructor handleExceptionsForConstructor = new HandleExceptionsForConstructor("", -1);
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.err.println("Failed to create Person: " + e.getMessage());
        }
    }
}

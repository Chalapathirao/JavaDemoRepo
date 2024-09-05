package com.chalapathi.test2;

public class DefaultArgumentsExample {

    // Method with one parameter
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Overloaded method with no parameters, acting like a "default" version
    public static void printMessage() {
        // Calls the other method with a default argument
        printMessage("Hello, World!"); // default value "Hello, World!"
    }

    public static void main(String[] args) {
        // Call method with the default "argument"
        printMessage(); // Outputs: Hello, World!

        // Call method with a custom argument
        printMessage("Custom Message!"); // Outputs: Custom Message!
    }
}


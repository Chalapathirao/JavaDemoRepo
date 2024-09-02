package com.chalapathi;

public class StackOverflowErrorExample {
    public static void main(String[] args) {
        recursiveMethod(); // Start the recursive call
    }

    public static void recursiveMethod() {
        // Calling the same method again without a termination condition
        recursiveMethod();
    }
}

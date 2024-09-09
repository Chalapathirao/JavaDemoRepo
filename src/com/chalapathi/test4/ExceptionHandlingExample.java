package com.chalapathi.test4;

//import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Finally block executed.");
        }
        int a = divide(44, 0);
        System.out.println(a);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

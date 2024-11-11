package com.chalapathi.interview1;

public class TryCatchFinallyReturnExample {
    public static void main(String[] args) {
        System.out.println("Result from method: " + testMethod());
    }

    public static int testMethod() {
        try {
            System.out.println("Inside try block");
 //           throw new Exception("Hi");
            return 1;  // Return statement in try
//            throw new Exception("Hi");   // unreachable both times
        } catch (Exception e) {
            System.out.println("Inside catch block");
            return 2;  // Return statement in catch
        } finally {
            System.out.println("Inside finally block");
            return 3;  // Return statement in finally (overrides others)
        }
    }
}


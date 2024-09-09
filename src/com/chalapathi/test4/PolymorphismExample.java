package com.chalapathi.test4;

public class PolymorphismExample {
    // Method with one parameter
    void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Overloaded method with two parameters
    void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    public static void main(String[] args) {
        PolymorphismExample obj = new PolymorphismExample();
        obj.display(5);         // Calls method with one parameter
        obj.display(5, 10);     // Calls overloaded method with two parameters
    }
}


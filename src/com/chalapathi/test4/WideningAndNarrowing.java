package com.chalapathi.test4;

public class WideningAndNarrowing {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        //Widening
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        //Narrowing
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);
    }
}

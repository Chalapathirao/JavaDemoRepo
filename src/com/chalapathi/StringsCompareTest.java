package com.chalapathi;

public class StringsCompareTest {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";

        if (string1.equals(string2)) { // compares reference and hashcode
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");

        }

        //another

        if (string1 == string2) { //reference comparison.
            System.out.println("The strings are the same object.");
        } else {
            System.out.println("The strings are different objects.");
        }
    }
}

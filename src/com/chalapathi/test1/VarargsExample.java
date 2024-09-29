package com.chalapathi.test1;

public class VarargsExample {
    public static void main(String... args) {//String[] args OR String []args  OR String args[]  OR
        System.out.println(args.length);
        // Call with no arguments
        printStrings();
        // Call with multiple arguments
        printStrings("Hello", "World", "Java", "Varargs");

    }

    public static void printStrings(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

package com.chalapathi.newfeatures.java17;

public class PatternMatchingForInstanceof {
    public static void main(String[] args) {
        String object = "Hello World";
        if (object instanceof String s) {
            System.out.println("String found: "+s);
        }
        else if (object instanceof Object o) {
            System.out.println("Object found: "+o);
        }
        else if (object instanceof CharSequence c) {
            System.out.println("CharSequence found: "+c);
        }
    }
}

package com.chalapathi.test4;

public class PassByValueExample {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x); // Output: 10
        modifyValue(x);
        System.out.println(x); // Output: 10
    }

    public static void modifyValue(int y) {
        y = 20;
    }
}

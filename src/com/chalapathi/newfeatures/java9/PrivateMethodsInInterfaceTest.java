package com.chalapathi.newfeatures.java9;

public class PrivateMethodsInInterfaceTest {
    public static void main(String[] args) {
        new A().test1();
    }
}

interface ABC {
    private void display() {
        System.out.println("Hellllo this is private method"); // not available outside.
    }

    default void display1() {
        System.out.println("Hellllo this is default method");
        display();
    }
}

class A implements ABC {
    void test1() {
        ABC.super.display1();
    }
}
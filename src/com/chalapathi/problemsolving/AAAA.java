package com.chalapathi.problemsolving;

interface A {
    default void print() {
        System.out.println("A");
    }
}

interface B {
    default void print() {
        System.out.println("B");
    }
}

public class AAAA implements A, B {
    @Override
    public void print() {
        A.super.print();
    }


    public static void main(String[] args) {
        new AAAA().print();
    }
}

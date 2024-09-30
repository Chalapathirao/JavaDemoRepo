package com.chalapathi.test1;


interface A {
    default void method() {
        System.out.println("Interface A method");
    }
}

interface B extends A {
    @Override
    default void method() {
        System.out.println("Interface B method");
    }
}

interface C extends A {
    @Override
    default void method() {
        System.out.println("Interface C method");
    }
}

interface L extends A, B {
    void methodC();
}


class D implements B , C {
    // Compilation error: method() is inherited from both B and C
    //Resolution : override the method in the class that implements the conflicting
    // interfaces and provide your own implementation like below
    @Override
    public void method() {
        // Call the specific method from the desired interface
        B.super.method();  // or C.super.method()
    }
}


public class DiamondProblem1 {
    public static void main(String[] args) {

    }
}

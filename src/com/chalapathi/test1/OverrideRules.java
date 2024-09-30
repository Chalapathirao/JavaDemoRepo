package com.chalapathi.test1;

import java.io.IOException;

class Base {
    protected void test1() throws RuntimeException {
        System.out.println("Base test1()");
    }

    int test2() {
        System.out.println("Base test2()");
        return 1;
    }

    void test3(long a, int b, short c) {
        System.out.println("Base test3()");
    }

    Base test4() {
        System.out.println("base test4()");
        return new Base();
    }

    void test5(Base b, Derived d) {
        System.out.println("Base test5");
    }

}

class Derived extends Base {
    @Override
    public void test1() {  //same void return type
        System.out.println("Derived test1()");
    }

    @Override
    public int test2() {  //same primitive return type.
        System.out.println("Derived test2()");
        return 1;
    }

    @Override
    protected void test3(long a, int b, short c) {
        System.out.println("Derived test3()");
    }

    @Override
    Derived test4() {  //co variant return type
        System.out.println("Derived test4()");
        return new Derived();
    }

    @Override
    void test5(Base b, Derived d) {
        System.out.println("Derived test5");
    }
}


public class OverrideRules {
    public static void main(String[] args) throws Exception {
        Base b = new Derived();
        b.test1();
        b.test2();
        System.out.println(b.test2());
    }
}

package com.chalapathi.test4;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideRules {
    public static void main(String[] args) {

    }
}

class Parent{
    protected void m1() {
        System.out.println("in Parent");
        throw new NullPointerException();
    }
}

class Child extends Parent{
    public void m1()  {
        System.out.println("in child");
    }
}

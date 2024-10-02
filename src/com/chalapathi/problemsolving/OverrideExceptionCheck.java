package com.chalapathi.problemsolving;

class Parent{
    void msg()throws ArithmeticException {
        System.out.println("parent method");
    }
}
public class OverrideExceptionCheck extends Parent{
    void msg()/*throws Exception*/ {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent p = new OverrideExceptionCheck();

        try {
            p.msg();
        }
        catch (Exception e){}
    }
}
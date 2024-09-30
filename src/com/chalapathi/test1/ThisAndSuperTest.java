package com.chalapathi.test1;

class SuperClass {

    public SuperClass(int a) {
        this.a = a;
    }

    int a;
    public void test(){
        System.out.println("test on Super");
    }
}

class SubClass extends SuperClass {
    int a;

    public SubClass(int a, int a1) {
        super(a);
        this.a = a1;
    }

    SubClass(){
        super(5);
        System.out.println(a);
    }


    @Override
    public void test(){
        super.test();
        this.a = 4;
        super.a= 6;
        System.out.println("test on sub");
    }
}


public class ThisAndSuperTest {

    public static void main(String[] args) {
        new SubClass(1,5).test();
    }
}

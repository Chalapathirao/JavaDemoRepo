package com.chalapathi.test6;

import java.util.Collection;

public class TestGenerics3 {
    public static void main(String args[]) {
        MyGen<Integer> m = new MyGen<>();
        m.add(2);
//m.add("vivek");//Compile time error
        System.out.println(m.get());
    }
}

class MyGen<T>{
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}



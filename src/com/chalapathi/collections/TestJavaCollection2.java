package com.chalapathi.collections;

import java.util.*;
public class TestJavaCollection2{
    public static void main(String args[]){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.add(null);
        al.add(null);
        System.out.println(al);
    }
}

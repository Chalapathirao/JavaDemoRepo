package com.chalapathi.collections;

import java.util.*;
public class TestJavaCollection3{
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        v.add("Ayush");
        v.add(null);
        v.add(null);
        System.out.println(v);
    }
}

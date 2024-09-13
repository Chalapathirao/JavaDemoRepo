package com.chalapathi.test6;

import java.util.*;
public class TestJavaCollection9{
    public static void main(String args[]){
//Creating and adding elements
//        TreeSet<String> set= new TreeSet<>();
//        set.add("Ravi");
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");
        TreeSet<Integer> set= new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(6);
        set.add(2);
//traversing elements
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

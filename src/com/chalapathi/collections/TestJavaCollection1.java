package com.chalapathi.collections;

import java.util.*;
public class TestJavaCollection1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add(null);
        list.add(null);
        System.out.println(list);
//Traversing list through Iterator
//        Iterator itr=list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        System.out.println(list.get(2));
        list.clear();
        System.out.println(list.isEmpty());
    }
}

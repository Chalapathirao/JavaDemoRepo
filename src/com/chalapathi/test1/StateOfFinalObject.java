package com.chalapathi.test1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateOfFinalObject {
    public static void main(String[] args) {
       // final int a =5;
        final List<String> list = Arrays.asList("Hello","Hi");
        System.out.println(list);
        list.set(0, "bye");
        System.out.println(list);
       // list.add("Test"); // java.lang.UnsupportedOperationException
       // list.remove("Hi"); //java.lang.UnsupportedOperationException
        System.out.println(list);
        final List<String> testList = new ArrayList();
        testList.add("one");
        testList.add("two");
        testList.set(0,"modified");
        System.out.println(testList);
        //testList = null; //error

    }
}

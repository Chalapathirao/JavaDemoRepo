package com.chalapathi.test7;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample
{
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
           list.add("D");  // Structural modification
        }
       // new Person("",9);
    }

    //public record Person(String name, int age) {}

}

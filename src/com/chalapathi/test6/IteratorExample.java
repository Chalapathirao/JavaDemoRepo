package com.chalapathi.test6;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using Iterator
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // Using ListIterator
//        ListIterator<String> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

        // Iterating backward
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//        }


        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        Iterator<String> iterator1 = fruits.iterator();
        iterator1.forEachRemaining(System.out::println);
        fruits.forEach(System.out ::println);

    }

}

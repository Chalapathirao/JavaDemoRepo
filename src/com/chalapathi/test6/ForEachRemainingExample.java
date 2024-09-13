package com.chalapathi.test6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachRemainingExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        // Getting an Iterator from the List
        Iterator<String> iterator = fruits.iterator();

        // Skipping the first element
        if (iterator.hasNext()) {
            System.out.println("Skipping: " + iterator.next());
        }
        if (iterator.hasNext()) {
            System.out.println("Skipping: " + iterator.next());
        }

        // Using forEachRemaining() to process the remaining elements
        iterator.forEachRemaining(fruit -> System.out.println("Remaining: " + fruit));
    }
}


package com.chalapathi.test6;

import java.util.Arrays;
import java.util.List;

public class ForEachOrderedExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        System.out.println("Using forEach with Parallel Stream:");
        fruits.parallelStream().forEach(System.out::println);

        System.out.println("\nUsing forEachOrdered with Parallel Stream:");
        fruits.parallelStream().forEachOrdered(fruit -> System.out.println(fruit));
    }
}


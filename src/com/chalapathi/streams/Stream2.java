package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "okok", "Hi", "Hello");

        names.parallelStream().forEach(name -> System.out.println(name));
        System.out.println();
        names.parallelStream().forEachOrdered(name -> System.out.println(name));

    }
}

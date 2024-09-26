package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

        // Using stream()
        list.stream().forEach(e-> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println(e);
        }); // Maintains order and uses only one thread main thread
        System.out.println();
        // Using parallelStream()
        list.parallelStream().forEach(e-> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println(e);
        }); // Order may vary uses multiple threads from forkjoin pool and main thread

        System.out.println();

        list.stream().forEachOrdered(e-> {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println(e);
        });
    }
}

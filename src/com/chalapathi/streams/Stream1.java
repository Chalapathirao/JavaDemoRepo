package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "BOB", "Charlie");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = list.parallelStream();
        Stream<String> parallel = list.stream().parallel();

        List<Integer> numbers = Arrays.asList(1, 3, 4, 2, 6, 9, 7, 8, 15);
        long count = numbers.parallelStream().map(n -> {
            System.out.println("Thread in map: " + Thread.currentThread().getName());
            return n * n;
        }).filter(n -> {
            System.out.println("Thread in filter: " + Thread.currentThread().getName());
            return n > 5;
        }).count();

        long count1 = numbers.stream().map(n -> {
            System.out.println("Thread in map: " + Thread.currentThread().getName());
            return n * n;
        }).filter(n -> {
            System.out.println("Thread in filter: " + Thread.currentThread().getName());
            return n > 5;
        }).count();

        System.out.println();
        list.stream().iterator().forEachRemaining(name -> {  //mostly orks on
            System.out.println("Thread in forEachRemaining: " + Thread.currentThread().getName());
            System.out.println(name);
        });
    }
}

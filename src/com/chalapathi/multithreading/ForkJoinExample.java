package com.chalapathi.multithreading;

import java.util.List;
import java.util.stream.IntStream;

public class ForkJoinExample {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();

        int sum = numbers.parallelStream()  // Uses ForkJoin common pool
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers 1 to 100: " + sum);
    }
}

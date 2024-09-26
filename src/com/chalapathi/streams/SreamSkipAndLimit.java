package com.chalapathi.streams;

import java.util.stream.Stream;

public class SreamSkipAndLimit {
    public static void main(String[] args) {
        System.out.println("Using limit():");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .limit(5) // Limits to first 5 elements
                .forEach(System.out::println); // Outputs: 1 2 3 4 5

        // Example using skip()
        System.out.println("Using skip():");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .skip(5) // Skips first 5 elements
                .forEach(System.out::println); // Outputs: 6 7 8 9
    }
}

package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<Integer> flatMapped = numbers.stream()
                .flatMap(n -> Arrays.asList(n, n * 2).stream())
                .collect(Collectors.toList());

        System.out.println(flatMapped);
        // Output: [1, 2, 2, 4, 3, 6]
    }
}

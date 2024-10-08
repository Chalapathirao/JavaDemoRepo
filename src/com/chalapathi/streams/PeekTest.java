package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 6, 4, 9, 8, 22);
        List<Integer> result = numbers.stream()
                .peek(n -> System.out.println("Original: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filter: " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("After map: " + n))
                .collect(Collectors.toList());
    }
}

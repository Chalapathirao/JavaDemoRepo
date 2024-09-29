package com.chalapathi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Original ArrayList in Ascending Order (Streams): " + numbers);
        // Sorting the ArrayList in ascending order using streams
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted ArrayList in Ascending Order (Streams): " + sortedList);

        // Sorting the ArrayList in descending order using streams
        List<Integer> sortedListDesc = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted ArrayList in Descending Order (Streams): " + sortedListDesc);
    }
}


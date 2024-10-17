package com.chalapathi.logicalproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNumberRepetition {
    public static void main(String[] args) {
        Map<Integer, Long> countMap = Stream.of(1, 2, 3, 4, 5, 5, 2, 2, 3, 4, 4, 4, 4)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countMap.forEach((number, count) -> System.out.println("Number : " + number + ", Count : " + count));

        normalWay();
       // usingStreams();
    }

    private static void normalWay() {
        // Define the map of numbers and their repeat counts
        Map<Integer, Integer> numberRepeats = Map.of(
                1, 5,
                2, 3,
                3, 2,
                4, 5,
                5, 4
        );
        // Create a list to store all numbers including repetitions
        List<Integer> numberList = new ArrayList<>();
        // Populate the list based on the frequencies defined in the map
        for (Map.Entry<Integer, Integer> entry : numberRepeats.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                numberList.add(entry.getKey());
            }
        }
        // Showing the entire list of numbers with repetitions
        System.out.println("Stream with repetitions: " + numberList);

        // Count frequencies of each number in the list
        Map<Integer, Long> frequencyMap = new HashMap<>();
        for (int number : numberList) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0L) + 1);
        }

        // Print the unique numbers and their frequencies
        frequencyMap.forEach((number, count) -> System.out.println("Number: " + number + ", Count: " + count));
    }

    private static void usingStreams() {
        // Step 1: Define the map of numbers and their repeat counts
        Map<Integer, Integer> numberRepeats = Map.of(
                1, 5,
                2, 3,
                3, 2,
                4, 5,
                5, 4
        );

        // Step 2: Generate the stream of numbers based on the frequency
        List<Integer> numberList = numberRepeats.entrySet().stream()
                .flatMapToInt(entry -> IntStream.range(0, entry.getValue()).map(_ -> entry.getKey()))
                .boxed()
                .toList();

        // Showing the entire list of numbers with repetitions
        System.out.println("Stream with repetitions: " + numberList);

        // Step 3: Count unique numbers
        Map<Integer, Long> frequencyMap = numberList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Step 4: Print unique numbers and their count
        frequencyMap.forEach((number, count) ->
                System.out.println("Number: " + number + ", Count: " + count));
    }
}

package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob");

// Creating a Stream from a collection
        Stream<String> nameStream = names.stream();
// Creating a Stream from an array
        Stream<String> arrayStream = Stream.of("Alice", "Bob", "Charlie");

//        String[] array = {"Hi", "Hello"};
//        Stream<String> stream = Arrays.stream(array);
        Stream<String> stream = Arrays.stream(new String[]{"Hi", "Hello"});
        Stream<String> empty = Stream.empty();
        Stream<String> generate = Stream.generate(()-> "one"); //infinite numbers
        Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
        //randomNumbers.limit(20).forEach(System.out::println);
        Stream<Object> build = Stream.builder().add("Java").add("Python").build();
        int num= 10;
        IntStream.range(1, num + 1).forEach(System.out::println);

        Stream<Integer> iteratedStream = Stream.iterate(1, n -> n + 2).limit(5);
        Stream<String> linesStream = "Line1\nLine2\nLine3".lines();
        IntStream charsStream = "abc".chars();


        Stream<String> filteredStream = names.stream().filter(s -> s.startsWith("A"));
        Stream<Integer> lenthsStream = names.stream().map(String::length);
        Stream<String> sorted = names.stream().sorted();
        Stream<String> distinct = names.stream().distinct();
        long count = names.stream().count();
        System.out.println(distinct.collect(Collectors.toSet()));
        Stream<String> limit = names.stream().limit(2);
        System.out.println(limit.toList());
        Stream<String> skip = names.stream().skip(1);
        System.out.println(skip.toList());
        Stream<String> limit1 = names.stream().limit(1);


    }
}

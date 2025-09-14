package com.chalapathi.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        Stream<Object> empty = Stream.empty();
        String[] arr = {"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        System.out.println(streamOfArrayFull.toList());
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        System.out.println(streamOfArrayPart.toList());

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println(streamBuilder.toList());

        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);
        System.out.println(streamGenerated.toList());

        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
        System.out.println(streamIterated);

        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);
        System.out.println();
        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(System.out::println);
        System.out.println();
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);
    }
}

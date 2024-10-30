package com.chalapathi.streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplyStreamOps {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("apple", "banana", "orange", "elephant", "iguana", "octopus", "unicorn");
        String collect = list.filter(s -> s.startsWith("a") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u") || s.startsWith("e"))
                .map(String::toUpperCase).sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}

package com.chalapathi.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMorePrograms {

    public static void main(String[] args) {
        //write a java 8 stream code to squre and only even numbers and print
        IntStream.rangeClosed(1,20).boxed().filter(n ->n%2==0).map(n-> n*n).forEach(System.out::println);
        // transfer list of integers to square each even element and skip all odd number from the out put
       // IntStream.rangeClosed(1,20).boxed().filter(n ->n%2==0).map(n-> n*n)

      //  Stream of numbers 1 2 3 4 5, where 1 is 5 times, 3 is two times, 2 is three times and 4 is five times and 5 is 4 times print unique numbers and print count of each number java 8
        Map<Integer, Long> countMap = Arrays.asList(1, 2, 3, 4, 5, 5, 2, 2, 3, 4, 4, 4, 4)
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countMap.forEach((number, count) -> {
            System.out.println("Number: " + number + ", Count: " + count);
        });



    }
}

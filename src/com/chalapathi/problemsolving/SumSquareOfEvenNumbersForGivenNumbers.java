package com.chalapathi.problemsolving;

import java.util.List;

public class SumSquareOfEvenNumbersForGivenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        int sum = integers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
        System.out.println(sum);
        System.out.println(integers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).reduce(0, Integer::sum));
    }
}

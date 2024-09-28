package com.chalapathi.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.chalapathi.streams.DataBase.getEmployees;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);
        Integer reduceSum = numbers.stream().reduce(0, Integer::sum); // OR  0 ,(a, b) -> a + b

        Integer reduceSum1 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum1);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        System.out.println("reduceSum = "+reduceSum);

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("mulResult = "+mulResult);
        System.out.println("multiply with method reference= "+numbers.stream().reduce(1, Math::multiplyExact));


        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("maxvalue = "+maxvalue);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max value  mr= "+maxvalueWithMethodReference);

        System.out.println(numbers.stream().mapToInt(t-> t).max().getAsInt());
        //System.out.println("comparingint ="+numbers.stream().collect(Collectors.maxBy(Comparator.comparingInt(Integer::intValue))).get());

        System.out.println("comparingint ="+numbers.stream().max(Comparator.comparingInt(Integer::intValue)).get());
        System.out.println();
        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longestString);
        System.out.println("Long String "+words.stream()
                .max(Comparator.comparingInt(String::length)).get());


        //get employee whose grade A
        //get salary
        double avgSalary = getEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("IT"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgSalary);

        double sumSalary = getEmployees().stream()
                .filter(employee -> employee.getDept().equalsIgnoreCase("CIVIL"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);



    }
}

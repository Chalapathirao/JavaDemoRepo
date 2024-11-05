package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
        consumer.accept(20);
        System.out.println();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().forEach(x -> getIntegerConsumer(String.valueOf(x)));
    }

    private static Consumer<Integer> getIntegerConsumer(String x) {
        return t -> System.out.println(x + t);
    }
}

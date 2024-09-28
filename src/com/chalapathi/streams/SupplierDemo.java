package com.chalapathi.streams;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {
    public static void main(String[] args) {
       // List<String> list1 = Arrays.asList();
        List<String> list1 = List.of();
        //System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewers"));
        System.out.println(list1.stream().findAny().orElse("Hi viewers"));
    }
}

package com.chalapathi.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringJoin {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";

        String result = str1 + str2;  // "Hello, World!"
        System.out.println("Using + operator: "+result);

        result = str1.concat(str2);  // "Hello, World!"
        System.out.println("Using concat() operator: "+result);

        StringBuilder sb = new StringBuilder(); // not sync, no thread safe, new class
        sb.append("Hello, ");
        sb.append("World!");
        result = sb.toString();
        System.out.println("Using StringBuilder append() : "+result);

        StringBuffer sbu = new StringBuffer();   //Sync, thread safe and old class 1.0
        sbu.append("Hello, ");
        sbu.append("World!");
        result = sbu.toString();
        System.out.println("Using StringBuffer append() : "+result);

        result = String.join(", ", "Hello", "World", "Java"); //java8
        System.out.println("Using String.join() : "+result);

        result = String.format("%s, %s!", str1, str2);
        System.out.println("Using String.format() : "+result);

        List<String> words = Arrays.asList("Hello", "World", "Java");
        result = words.stream().collect(Collectors.joining(" "));
        System.out.println("Using java 8 streams: "+result);

        String[] wordss = {"Hello", "World"};
        result = Arrays.toString(wordss);
        System.out.println("Using java Arrays.toString(): "+result);

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Hello");
        joiner.add("World");
        result = joiner.toString();

    }
}

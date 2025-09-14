package com.chalapathi.test1;

import java.util.stream.Stream;

public class StringMethodsTest {
    public static void main(String[] args) {
        //isBlank()
        String nonBlank = "Java 11";
        String blank = "   \t\n";
        System.out.println("Is 'Java 11' blank? " + nonBlank.isBlank());  // Output: false
        System.out.println("Is whitespace string blank? " + blank.isBlank());  // Output: true

        //lines()
        String multilineText = "This is line one.\nThis is line two.\nThis is line three.";
        // Obtain a Stream for each line of the string
        Stream<String> lines = multilineText.lines();
        lines.forEach(System.out::println);

        Stream<String> lines1 = "test1\rtest2\rtest3\rtest4".lines();
        lines1.forEach(System.out::println);

      //strip(), stripLeading(), and stripTrailing()
        String text = "   Java 11 String Methods   ";
        System.out.println("Original: [" + text + "]");
        System.out.println("strip(): [" + text.strip() + "]");
        System.out.println("stripLeading(): [" + text.stripLeading() + "]");
        System.out.println("stripTrailing(): [" + text.stripTrailing() + "]");

        //repeat(int count)
        String pattern = "Java!";
        String repeated = pattern.repeat(3);
        System.out.println("Repeated string: " + repeated);
        // Output: Java!Java!Java!
    }
}

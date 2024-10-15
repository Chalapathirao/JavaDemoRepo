package com.chalapathi.logicalproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPrograms1 {
    public static void main(String[] args) {
//        convertArrayOfStringsToOneString();
        removeduplicateCharsFromString();
    }

    private static void convertArrayOfStringsToOneString() {
        String[] stringArray = { "My", "name", "is", "Chalapathi", "!" };
        System.out.println(Arrays.toString(stringArray)); // Arrays.toString(arr)

        // OR
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i]);
        }
        System.out.println(stringBuilder);

        // OR

        String str = String.join("", stringArray);
        System.out.println(stringBuilder.toString()); // String.join(" ", stringArray);

        // OR

        String str1 = Arrays.stream(stringArray).collect(Collectors.joining());
        System.out.println(str1);

        //OR

//        // Convert array to string with Arrays.toString()
//        String result = Arrays.toString(stringArray);
//        System.out.println(result);

        //OR
       StringBuilder result = new StringBuilder();
        for (String s : stringArray) {
            result = new StringBuilder(result.toString().concat(s));
        }
        System.out.println(result);

        //OR

        result = new StringBuilder();
        for (String s : stringArray) {
            result.append(String.format("%s ", s));
        }

        result = new StringBuilder(result.toString().trim());  // Remove the trailing space
        System.out.println(result);

    }

    private static void removeduplicateCharsFromString() {
        String inputString = "My name is ChalapathiRao davala!";

        // Use LinkedHashSet to store unique characters and maintain insertion order
        Set<Character> set = new LinkedHashSet<>();
        // Add each character to the set
        for (char c : inputString.toCharArray()) {
            set.add(c);
        }
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }
        // Print the result
        System.out.println(result);  // Output: progamin

        //OR

        String collect = Arrays.stream(inputString.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(collect);

        //OR

        Set<String> set1 = new LinkedHashSet<>();
        String collect1 = Arrays.stream(inputString.split("")).filter(set1::add).collect(Collectors.joining(""));
        System.out.println(collect1);
    }



}

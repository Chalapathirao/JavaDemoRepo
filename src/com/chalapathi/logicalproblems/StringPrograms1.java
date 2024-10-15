package com.chalapathi.logicalproblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPrograms1 {
    public static void main(String[] args) {
//        convertArrayOfStringsToOneString();
//        removeduplicateCharsFromString();
        /*System.out.println("Given Strings: anagram status: " + chackTwoStringsareAnagrams("listen", "silent"));
        System.out.println("Given Strings: anagram status: " + chackTwoStringsareAnagrams("alaram", "mlaram"));
        System.out.println("anagram status: "+areAnagramsUsingStreams("listen", "silent"));*/

        reverseStringWithoutReverseMethod();

    }

    private static void convertArrayOfStringsToOneString() {
        String[] stringArray = {"My", "name", "is", "Chalapathi", "!"};
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
        System.out.println(result);  // Output: progamin

        //OR

        StringBuilder result1 = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            // Append only if the character is not already in the result
            if (result1.indexOf(String.valueOf(currentChar)) == -1) {
                result1.append(currentChar);
            }
        }
        System.out.println(result1);

        //OR

        String collect = Arrays.stream(inputString.split("")).distinct().collect(Collectors.joining(""));
        System.out.println(collect);

        //OR

        Set<String> set1 = new LinkedHashSet<>();
        String collect1 = Arrays.stream(inputString.split("")).filter(set1::add).collect(Collectors.joining(""));
        System.out.println(collect1);
    }

    public static boolean chackTwoStringsareAnagrams(String str1, String str2) {
        //The simplest way to check if two strings are anagrams is to sort both strings and compare them.
        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert strings to char arrays, sort them, and compare
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static boolean areAnagramsUsingStreams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert strings to sorted streams and compare them
        return Arrays.equals(Arrays.stream(str1.split(""))
                .sorted()
                .toArray(), Arrays.stream(str2.split(""))
                .sorted()
                .toArray());
    }


    public static void reverseStringWithoutReverseMethod(){
        String s = "HelloWorld";

        // Using StringBuilder to reverse
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);  // Output: olleh

        //OR

        StringBuffer sb1 = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb1.append(s.charAt(i));
        }
        System.out.println(sb1);

        //OR
        char[] ch =s.toCharArray();
        StringBuilder rev= new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println(rev);

    }

}

package com.chalapathi.problemsolving;



import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacterInaStringAndItsIndex {

    public static int firstUniqChar(String s) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> countMap = new LinkedHashMap<>();

        // Populate the HashMap with each character's frequency
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the string to find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;  // Return the index as soon as we find a character with a count of 1
            }
        }

        return -1;  // If no unique character found, return -1
    }

    public static void main(String[] args) {
        String input = "leetcode";
        int index = firstUniqChar(input);
        System.out.println("The index of the first non-repeating character is: " + index);
    }
}
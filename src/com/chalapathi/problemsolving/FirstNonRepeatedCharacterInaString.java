package com.chalapathi.problemsolving;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInaString {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedCharacter("AAnish"));
        System.out.println(findFirstNonRepeatedCharacterUsingStreams("AAnish"));
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>();

        // Populate the LinkedHashMap with character counts
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        // Iterate in the order of character appearance to find the first non-repeated character
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();  // Return the first non-repeated character
            }

        }
        // Return a default value if no non-repeated character is found
        throw new RuntimeException("No non-repeated character found");
    }

    //String s = "AAnish"
    public static Character findFirstNonRepeatedCharacterUsingStreams(String str) {
        // Create a LinkedHashMap that maintains the order of characters
        LinkedHashMap<Character, Long> characterCounts = str.chars()
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first entry with a count of 1
        return characterCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeated character found"));

    }

    /*public static Character findThirdNonRepeatedCharacterUsingStreams(String str) {

    }*/

}

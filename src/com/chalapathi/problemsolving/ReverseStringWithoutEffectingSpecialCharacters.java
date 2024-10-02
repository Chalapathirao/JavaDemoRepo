package com.chalapathi.problemsolving;

public class ReverseStringWithoutEffectingSpecialCharacters {

    public static void main(String[] args) {
        String input = "a,b$c#hello!ok";
        System.out.println("Original String: " + input);
        String output = reverseStringWithoutAffectingSpecialCharacters(input);
        System.out.println("Reversed String: " + output);
    }

    public static String reverseStringWithoutAffectingSpecialCharacters(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (!Character.isLetter(characters[left])) {
                left++;  // Skip if current character is not a letter
            } else if (!Character.isLetter(characters[right])) {
                right--; // Skip if current character is not a letter
            } else {
                // Swap the characters
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;

                left++;
                right--;
            }
        }
        return new String(characters);
    }
}

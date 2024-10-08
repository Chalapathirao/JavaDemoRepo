package com.chalapathi.problemsolving;

public class CountSubstringOccurrences {

    public static int countOccurrences(String bigString, String smallString) {
        // Convert to lowercase for case-insensitive matching
        bigString = bigString.toLowerCase();
        smallString = smallString.toLowerCase();

        int count = 0;
        int idx = 0;

        // Continue looping until no more instances of the substring are found
        while ((idx = bigString.indexOf(smallString, idx)) != -1) {
            count++;
            idx += smallString.length(); // Move the index to the end of the found substring
        }

        return count;
    }

    public static void main(String[] args) {
        final String bigString = "mOneyMOneyIndiaMoneyAbcDefMoney";
        final String smallString = "mOney";

        int occurrences = countOccurrences(bigString, smallString);
        System.out.println("The substring 'mOney' appears " + occurrences + " times.");
    }
}

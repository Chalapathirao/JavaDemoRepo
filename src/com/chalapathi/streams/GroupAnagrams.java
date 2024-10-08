package com.chalapathi.streams;

import java.util.*;
import java.util.stream.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"cat", "tac", "rat", "bat", "tab"};

        Map<String, List<String>> anagrams = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }
                ));

        for (List<String> group : anagrams.values()) {
            System.out.println(group);
        }
    }
}

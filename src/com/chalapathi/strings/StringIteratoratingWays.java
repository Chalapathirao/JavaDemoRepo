package com.chalapathi.strings;

import java.util.Iterator;
import java.util.StringTokenizer;

public class StringIteratoratingWays {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
        System.out.println();
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        System.out.println();
        int i = 0;
        while (i < str.length()) {
            System.out.println(str.charAt(i));
            i++;
        }

        System.out.println();
        str.chars().forEach(c -> System.out.println((char) c));
        System.out.println();

        Iterator<Integer> iterator = str.chars().iterator();
        while (iterator.hasNext()) {
            System.out.println((char) iterator.next().intValue());
        }

        System.out.println();
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println();
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

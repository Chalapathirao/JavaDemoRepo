package com.chalapathi.streams;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[0]= "word";
        words[1]= "word1";
        //without optionl
//        words[5].toLowerCase();
//        System.out.println(words);
        //with optinal
        Optional<String> word = Optional.ofNullable(words[5]);
        if (word.isPresent()){
            String word1 = word.get().toLowerCase();
        } else {
            System.out.println("word is null");
        }

    }
}

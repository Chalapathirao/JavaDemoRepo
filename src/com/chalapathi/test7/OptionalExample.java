package com.chalapathi.test7;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        String[] str = new String[10];
//        String lowercaseString = str[5].toLowerCase();
//        System.out.print(lowercaseString);
        //Gives NULL pointer exception

        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } else {
            System.out.println("string value is not present");
        }

    }
}

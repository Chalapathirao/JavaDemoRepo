package com.chalapathi.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalVarTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hello", "Hai");
        var list = list1;
        list.stream()
                .map(( var item) -> item.toUpperCase())
                .forEach(System.out::println);

        var message = "Hello, Java 10";  // Compiler infers String type
        var number = 42;                 // Compiler infers int type
        var list2 = new ArrayList<String>(); // Compiler infers ArrayList<String>
    }
}

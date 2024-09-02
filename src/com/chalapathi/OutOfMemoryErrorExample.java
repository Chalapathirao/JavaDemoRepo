package com.chalapathi;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        // Infinite loop to keep adding objects to the list
        while (true) {
            list.add(new Object()); // Adding objects to the list continuously
        }
    }
}

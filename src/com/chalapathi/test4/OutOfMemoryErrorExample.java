package com.chalapathi.test4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    static int count = 0;
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        // Infinite loop to keep adding objects to the list
        try {
            while (true) {
                count++;
                System.out.println("Adding objects to the list- count: "+count);
                list.add(new Object()); // Adding objects to the list continuously
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Final block executed and terminated- count: "+count);
        }
    }
}

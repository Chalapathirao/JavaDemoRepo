package com.chalapathi.problemsolving;

import java.util.HashMap;

public class TempTesting {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the map
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Accessing an element
        String value = map.get(2);  // returns "two"
        System.out.println("Value for key 2 is: " + value);

        // Checking if a key is present
        if(map.containsKey(3)) {
            System.out.println("Map contains key 3");
        }

        // Iterating over map entries
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
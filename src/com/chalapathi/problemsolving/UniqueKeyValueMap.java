package com.chalapathi.problemsolving;

import java.util.HashMap;
import java.util.Map;
//Having one hashMap with key/value, we know key are unique. how  to make value also unique????
public class UniqueKeyValueMap {
    private Map<Integer, String> keyToValueMap = new HashMap<>();
    private Map<String, Integer> valueToKeyMap = new HashMap<>();

    public void put(Integer key, String value) {
        if (keyToValueMap.containsKey(key)) {
            throw new IllegalArgumentException("Key already present");
        }
        if (valueToKeyMap.containsKey(value)) {
            throw new IllegalArgumentException("Value already present as a key for another entry");
        }

        keyToValueMap.put(key, value);
        valueToKeyMap.put(value, key);
    }

    public void display() {
        System.out.println(keyToValueMap);
    }

    public static void main(String[] args) {
        UniqueKeyValueMap map = new UniqueKeyValueMap();

        map.put(1, "one");
        map.put(2, "two");

        try {
            map.put(3, "two");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        map.display();
    }
}

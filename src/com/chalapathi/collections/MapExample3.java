package com.chalapathi.collections;

import java.util.*;

public class MapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())   
                //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                // .sorted(Map.Entry.comparingByValue())
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}

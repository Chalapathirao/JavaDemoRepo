package com.chalapathi.sorting;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String[] args) {
        //Map<String, Integer> unsortedMap = new HashMap<>();
//        unsortedMap.put("b", 2);
//        unsortedMap.put("a", 1);
//        unsortedMap.put("d", 4);
//        unsortedMap.put("c", 3);
        //OR
        Map<String, Integer> unsortedMap = Map.of("b", 2, "a", 1, "d", 4, "c", 3);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        // Create a LinkedHashMap to maintain the order
        Map<String, Integer> sortedByKey = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedByKey.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted by value: " + sortedByKey);
        System.out.println();
        LinkedHashMap<String, Integer> collect = unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()
                        /*.thenComparing(Map.Entry.comparingByKey())*/)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        System.out.println("Sorted by value (Stream): " + collect);
    }
}

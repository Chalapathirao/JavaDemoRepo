package com.chalapathi.test6;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // Duplicates are allowed
        list.add(null);
        System.out.println(list);  // Output: [Apple, Banana, Apple]

        Collections.synchronizedList(list);

        List<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.remove("Apple");
        list.add(null);
        System.out.println(list1);  // Output: [Banana]

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate element, won't be added
        list.add(null);
        System.out.println(set);  // Output: [Banana, Apple] (order may vary)

    }
}

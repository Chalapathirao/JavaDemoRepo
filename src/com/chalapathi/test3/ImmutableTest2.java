package com.chalapathi.test3;



import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public Student(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;
        // Perform a deep copy of the mutable field
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
       // this.metadata = tempMap;
        this.metadata = Map.copyOf(metadata);
        //Collections.unmodifiableMap(metadata);
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        // Return a deep copy of the mutable field
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", metadata=" + metadata +
                '}';
    }
}

public class ImmutableTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student("ABC", 101, map);
        System.out.println(s);
//        System.out.println(s.getName()); // Output: ABC
//        System.out.println(s.getRegNo()); // Output: 101
//        System.out.println(s.getMetadata()); // Output: {1=first, 2=second}

        // Attempt to modify the original map
        map.put("3", "third");
        //System.out.println(s.getMetadata()); // Output: {1=first, 2=second}

        // Attempt to modify the returned map
        s.getMetadata().put("4", "fourth");
        //System.out.println(s.getMetadata()); // Output: {1=first, 2=second}
        System.out.println(s);
    }
}

package com.chalapathi.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);

        // Sorting the ArrayList in natural order (ascending)
        Collections.sort(numbers);

        // Printing the sorted ArrayList
        System.out.println("Sorted ArrayList in Ascending Order: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        //Collections.sort(numbers, Comparator.reverseOrder()); //Or
        System.out.println("Sorted ArrayList in Descending Order: " + numbers);
    }
}


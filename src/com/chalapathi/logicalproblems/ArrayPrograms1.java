package com.chalapathi.logicalproblems;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayPrograms1 {
    public static void main(String[] args) {
//        smallestAndLargestNumberInArray();
//        secondLargestElementInArray();
//        secondLargestNumberInArray();
//        secondLargestElementInArrayUsingStreams();
//        reverseOfAnArray();
//        reverseOfAnArrayUsingStreams();
//        removeDuplicatesFromArray();
//        countRepeatedElementsinArray();
//        insertElementatSpecificPositioninArray(new int[] { 10, 5, -15, 20, -30, 22, -5 }, 1000, 3);
//          removeElementFromArray(new int[] { 10, 5, -15, 20, -30, 22, -5 }, 3);
//        arrayClone();
//        sortAnArrayInAscendingOrder(new int[] { 10, 5, -15, 20, -30, 22, -5 });
 //       printDuplicateElementsInArray();
 //       pringTheFrequencyOfEachElementInArray();
        extractPairFromArrayWithFixedSum();
    }

    private static void smallestAndLargestNumberInArray() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);

        System.out.println(Arrays.stream(arr).max().getAsInt());
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }

    private static void secondLargestElementInArray() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        // Variables to hold the largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        // Check if there is a second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    // Find Second Largest Number in Array
    private static void secondLargestNumberInArray() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        // assign first element to fmax, smax
        int fmax = arr[0];
        int smax = arr[0];

        // compare with remaining elements
        // loop
        for (int i = 1; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if (smax < arr[i]) {
                smax = arr[i];
            }
        }
        System.out.println("Second largest number= " + smax);
    }

    private static void secondLargestElementInArrayUsingStreams() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        Optional<Integer> secondLargest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("secondLargest: " + secondLargest.get());

        //OR

        // Find the largest element
        OptionalInt largest = Arrays.stream(arr).max();

        // Find the second largest element by filtering out the largest
        OptionalInt secondLargest1 = Arrays.stream(arr)
                .filter(e -> e != largest.orElse(Integer.MIN_VALUE))
                .max();

        // Print the second largest element
        if (secondLargest1.isPresent()) {
            System.out.println("The second largest element is: " + secondLargest1.getAsInt());
        } else {
            System.out.println("No second largest element found.");
        }
    }

    private static void reverseOfAnArray() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        int[] reverseArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--) {
            reverseArr[j++] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArr));
    }

    private static void reverseOfAnArrayUsingStreams() {
        int[] arr = new int[]{10, 5, -15, 20, -30, 22, -5};
        List<Integer> reversedList = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        Collections.reverse(reversedList);
        Integer[] reversedArray = reversedList.toArray(new Integer[0]);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }

    private static void removeDuplicatesFromArray() {
        Integer[] arr = new Integer[]{10, 5, 10, 3, 9, 6, 2, 21, 0, 3, 4, 6, 99, 6, 7, 9};
        Set<Integer> s = new LinkedHashSet<>();
        for (Integer integer : arr) {
            s.add(integer);
        }
        Integer[] array1 = s.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));

        //OR
        Integer[] array = Arrays.stream(arr).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

        // OR

        List<Integer> collect = Arrays.stream(arr).distinct().toList();
        Integer[] array2 = collect.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array2));
    }

    private static void countRepeatedElementsinArray() {
        Integer[] arr = new Integer[]{10, 5, 10, 3, 9, 6, 2, 21, 0, 3, 4, 6, 99, 6, 7, 9};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = new HashSet<>();
        for (Integer integer : arr) {
            if (set.add(integer)) {
                map.put(integer, 1);
            } else {
                map.put(integer, map.get(integer) + 1);
            }
        }
        map.forEach((k, v) -> System.out.println(k + " Repeated " + v + " Times"));

        //OR
        Map<Integer, Long> elementCount = Arrays.stream(arr)
                //.boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Element counts in the array:");
        elementCount.forEach((key, value) -> System.out.println(key + " Repeated : " + value));

        //OR

        Map<Integer, Long> elementCount1 = Arrays.stream(arr)
                // .boxed()
                .collect(Collectors.toMap(
                        Function.identity(),
                        _ -> 1L,
                        Long::sum));

        System.out.println("Element counts in the array:");
        elementCount1.forEach((key, value) -> System.out.println(key + "Repeated: " + value));

    }

    private static void insertElementatSpecificPositioninArray(int[] arr, int element, int position) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i == position) {
                temp[i] = element;
            } else {
                temp[i] = arr[j++];
            }
        }
        System.out.println("Actual Array " + Arrays.toString(arr));
        System.out.println("new Array    " + Arrays.toString(temp));

        //OR

        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        list.add(position, element);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }

    private static void removeElementFromArray(int[] arr, int position) {
        int temp[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == position) {
                continue;
            } else {
                temp[j++] = arr[i];
            }
        }
        System.out.println("Actual Array " + Arrays.toString(arr));
        System.out.println("new Array    " + Arrays.toString(temp));

        //OR

        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        list.remove(position);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }

    private static void arrayClone() {
        int[] arr = {33, 3, 4, 5};
        System.out.println("Actual Array " + Arrays.toString(arr));
        int[] clone = arr.clone();
        System.out.println("Cloned Array " + Arrays.toString(clone));
        System.out.println("Are both equal?");
        System.out.println(arr == clone);
    }

    private static void sortAnArrayInAscendingOrder(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                //for descending
//				if(arr[i] < arr[j]) {
//	                   temp = arr[i];
//	                   arr[i] = arr[j];
//	                   arr[j] = temp;
//	               }
            }
        }
        System.out.println("Array sorting in ascending order: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void printDuplicateElementsInArray() {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.print(" " + arr[j]);
            }
        }

        //OR
        System.out.println();
        // Create a set to track unique elements
        Set<Integer> seen = new HashSet<>();
        // Print duplicate elements using streams
        List<Integer> duplicates = Arrays.stream(arr).boxed()
                .filter(e -> !seen.add(e))  // Add to set and check if it was already there
                .toList();

        // Print the duplicates
        System.out.println("Duplicate elements: " + duplicates);

        //OR

        // Use a map to count occurrences of each element
        Map<Integer, Long> elementCount = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Print elements that have a count greater than 1 (duplicates)
        List<Integer> duplicates1 = elementCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only elements with count > 1
                .map(Map.Entry::getKey)  // Extract the key (element)
                .toList();

        // Print the duplicates
        System.out.println("Duplicate elements: " + duplicates1);
    }

    private static void pringTheFrequencyOfEachElementInArray() {
        // Sample array
        Integer[] array = {1, 2, 3, 2, 4, 5, 3, 6, 4, 7, 8, 5, 3};
        Arrays.stream(array).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " occurs " + value + " time(s)"));
    }

    private static void extractPairFromArrayWithFixedSum(){
        int [] nums = {2, 4, 3, 7, 1, 5, 9, 8};
        int target=10;
        Set<Integer> set= new HashSet<>();
        for (int num : nums) {
            if (!set.contains(target - num)) {
                set.add(num);
            } else {
                int res = target - num;
                System.out.println("(" + res + "," + num + ")");
            }
        }
    }

}

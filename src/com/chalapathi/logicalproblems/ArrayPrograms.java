package com.chalapathi.logicalproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayPrograms {

	public static void main(String[] args) {

		// findTheLargestAndSmallestNumbersInArray();
		// secondLargestNumberInArray();
		// reverseOfAnArray();
		// removeDuplicatesFromArray();
		// countRepeatedElementsinArray();
		// insertElementatSpecificPositioninArray(new int[] { 10, 5, -15, 20, -30, 22,
		// -5 }, 1000, 3);
		// insertElementatSpecificPositioninArray(new int[] { 10, 5, -15, 20, -30, 22,
		// -5 }, 1000, 0);
		// removeElementFromArray(new int[] { 10, 5, -15, 20, -30, 22, -5 }, 3);
		// arrayClone();
		//rotateArrayByLeft(new int[] { 10, 5, -15, 20, -30, 22, -5 }, 2);
		sortAnArrayInAscendingOrder(new int[] { 10, 5, -15, 20, -30, 22, -5 });
	}

	// Find the Largest Number in an Array
	private static void findTheLargestAndSmallestNumbersInArray() {

		int[] arr = new int[] { 10, 5, -15, 20, -30, 22, -5 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
	}

	// Find Second Largest Number in Array
	private static void secondLargestNumberInArray() {
		int[] arr = new int[] { 10, 5, -15, 20, -30, 22, -5 };
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

	private static void reverseOfAnArray() {
		int[] arr = new int[] { 10, 5, 1, 3, 9, 6, 22, 2, 0, 4 };
		int[] revArr = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			revArr[j] = arr[i];
		}
		System.out.println(Arrays.toString(revArr));
	}

	private static void removeDuplicatesFromArray() {
		Integer[] arr = new Integer[] { 10, 5, 10, 3, 9, 6, 2, 21, 0, 3, 4, 6, 99, 6, 7, 9 };
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (Integer integer : arr) {
			set.add(integer);
		}
		Integer[] arraye = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(arraye));

		// OR

		List<Integer> collect = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		Integer[] array = collect.toArray(new Integer[collect.size()]);
		System.out.println(Arrays.toString(array));
	}

	private static void countRepeatedElementsinArray() {

		Integer[] arr = new Integer[] { 10, 5, 10, 3, 9, 6, 2, 21, 0, 3, 4, 6, 99, 6, 7, 99 };
		Map<Integer, Integer> map = new LinkedHashMap<>();
		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : arr) {
			if (set.add(integer)) {
				map.put(integer, 1);
			} else {
				map.put(integer, map.get(integer) + 1);
			}
		}
		map.forEach((k, v) -> System.out.println(k + " Repeated " + v + " Times"));
	}

	private static void insertElementatSpecificPositioninArray(int[] arr, int element, int position) {
		int temp[] = new int[arr.length + 1];
		for (int i = 0, j = 0; i < temp.length; i++) {
			if (i == position) {
				temp[i] = element;
			} else {
				temp[i] = arr[j++];
			}
		}
		System.out.println("Actual Array " + Arrays.toString(arr));
		System.out.println("new Array    " + Arrays.toString(temp));
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
	}

	private static void arrayClone() {
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Actual Array " + Arrays.toString(arr));

		int carr[] = arr.clone();
		System.out.println("Cloned Array" + Arrays.toString(carr));
		System.out.println("Are both equal?");
		System.out.println(arr == carr);
	}

	private static void rotateArrayByLeft(int[] arr, int n) {
		// Displays original array
		System.out.println(Arrays.toString(arr));
		// Rotate the given array by n times toward left
		for (int i = 0; i < n; i++) {
			int j, first;
			// Stores the first element of the array
			first = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				// Shift element of array by one
				arr[j] = arr[j + 1];
			}
			// First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		System.out.println(Arrays.toString(arr));
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
}

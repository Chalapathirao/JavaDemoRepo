package com.chalapathi.newfeatures.java8;

import java.util.Arrays;

public class ParellelSort {
	public static void main(String[] args) {
		int numbers[] = { 22, 89, 1, 32, 19, 5 };
		// Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
		
		// converting the array to stream and displaying using forEach
		//Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		
		//method reference
		Arrays.stream(numbers).forEach(System.out::println);
		
		/* Specifying the start and end index. The start index is
		 * 1 here and the end index is 5. which means the the elements
		 * starting from index 1 till index 5 would be sorted.
		 */
		int numbers1[] = { 22, 89, 1, 32, 19, 5 };
		Arrays.parallelSort(numbers1, 1, 3);
		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers1).forEach(n->System.out.print(n+" "));
	}
}

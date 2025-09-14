
//A Stream in Java can be defined as a sequence of elements from a source. 
//The source of elements here refers to a Collection or Array that provides data to the Stream.

//Stream Operations
//
//Creating Streams
//
//concat()
//empty()
//generate()
//iterate()
//of()
//
//Intermediate Operations
//
//filter()
//map()
//flatMap()
//distinct()
//sorted()
//peek()
//limit()
//skip()
//
//Terminal Operations
//
//forEach()
//forEachOrdered()
//toArray()
//reduce()
//collect()
//min()
//max()
//count()
//anyMatch()
//allMatch()
//noneMatch()
//findFirst()
//findAny()

package com.chalapathi.newfeatures.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");

		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
		System.out.println("----");
		memberNames.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("----");

		memberNames.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println(s));
		System.out.println("----");
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("----");
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.print(memNamesInUppercase);

		System.out.println("----");
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // true

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // false

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // false

		System.out.println("----");
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);

		// creating a stream of a fixed number of integers
		// Stream.of()
		System.out.println("----");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// creating a stream from the array
		// Stream.of(array)
		System.out.println("----");
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		stream1.forEach(p -> System.out.println(p));

		System.out.println("-----");
		// Stream.generate() or Stream.iterate()
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);
		
		//Collect Stream elements to an Array
		System.out.println("-----");
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}
		Stream<Integer> stream2 = list.stream();
		Integer[] evenNumbersArr = stream2.filter(i -> i%2 == 0).toArray(Integer[]::new);
		System.out.print(evenNumbersArr);
	}

}

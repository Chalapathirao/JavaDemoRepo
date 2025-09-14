package com.chalapathi.newfeatures.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
	public static void main(String[] args) {

		creatingStreamFromArray();
		//summingusingStream();
	}

	private static void creatingStreamFromArray() {
		// Array can also be a source of a Stream
		Stream<String> streamOfArray = Stream.of("ab", "bc", "cd");
		streamOfArray.forEach(System.out::println);

		// creating from existing array or of a part of an array:
		String[] arr = new String[] { "al", "bl", "cl" };
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);

		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		streamOfArrayPart.forEach(System.out::println);
		
		Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID);
        uuidStream.limit(10).forEach(System.out::println);
	}
	
	private static void summingusingStream() {
		 List < Product > productsList = new ArrayList < Product > ();
	        //Adding Products  
	        productsList.add(new Product(1, "HP Laptop", 25000f));
	        productsList.add(new Product(2, "Dell Laptop", 30000f));
	        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
	        productsList.add(new Product(4, "Sony Laptop", 28000f));
	        productsList.add(new Product(5, "Apple Laptop", 90000f));
	        // Using Collectors's method to sum the prices.  
	        double totalPrice3 = productsList.stream()
	            .collect(Collectors.summingDouble(product -> product.getPrice()));
	        System.out.println(totalPrice3);
	}
}

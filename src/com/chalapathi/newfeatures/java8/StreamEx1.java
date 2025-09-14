
package com.chalapathi.newfeatures.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// StreamEx1.findNofStringwhoseLength6();
		// combiningTwoNewStreams();
//		filteringCollectionWithoutStreams();
//		filteringCollectionWithStreams();
		// iterating();
		// filteringAndIteratingCollection();
		// collectasSum();
		// findingMaxAndMinPriceOfCollection();
		// countTheNoOfProductsInaList();
		// convertListIntoSet();
		// convertListIntoMap();
		methodReferenceWithStreams();

	}

	private static void methodReferenceWithStreams() {

		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = productsList.stream().filter(p -> p.price >= 30000) // filtering data
				.map(Product::getPrice) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
		//
		List<Float> productPriceList1 = productsList.stream().filter(p -> p.price >= 30000) // filtering data
				.map(p ->p.price) // fetching price 
				.collect(Collectors.toList());
				//.forEach(System.out :: println);// printing as list
      System.out.println(productPriceList1);
	}

	private static void convertListIntoMap() {

		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		Map<Integer, String> productPriceMap = productsList.stream().collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(productPriceMap);
	}

	private static void convertListIntoSet() {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000) // filter product
																										// on the base
																										// of price
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate
																			// elements)
		System.out.println(productPriceList);

		productsList.stream().map(product -> product.name).collect(Collectors.toSet()).forEach(System.out::println);

	}

	private static void countTheNoOfProductsInaList() {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// count number of products based on the filter
		long count = productsList.stream().filter(product -> product.price < 30000).count();
		System.out.println(count);

	}

	private static void findingMaxAndMinPriceOfCollection() {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// max() method to get max Product price
		Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productA.price);
		// min() method to get min Product price
		Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1)
				.get();
		System.out.println(productB.price);
	}

	// filtering and iterating collection
	private static void filteringAndIteratingCollection() {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		productsList.stream().filter(p -> p.price == 30000).forEach(p -> System.out.println(p.name));
	}

	private static void iterating() {
		// TODO Auto-generated method stub
		Stream.iterate(1, element -> element + 1) // iterating infinite
				.limit(10).forEach(System.out::println); // printing
	}

	private static void filteringCollectionWithStreams() {

		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> collect = productsList.stream() // creating stream
				.filter(p -> p.price < 30000) // filtering stream
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting price as list
		System.out.println(collect);

	}

	// finding no of Strings whose length is less than 6
	public static void findNofStringwhoseLength6() {
		// with out streams
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Adityaerty");
		names.add("Steveee");
		int count = 0;
		for (String str : names) {
			if (str.length() < 6)
				count++;
		}
		System.out.println("There are " + count + " strings with length less than 6");
		// with java 8 streams
		long count1 = names.stream().filter(str -> str.length() < 6).count();
		System.out.println("There are " + count1 + " strings with length less than 6");
	}

	// combining two new streams
	public static void combiningTwoNewStreams() {
		// list 1
		List<String> alphabets = Arrays.asList("All", "But", "Cost");
		// list 2
		List<String> names = Arrays.asList("Sansa", "Jon", "Arya");

		// creating two streams from the two lists and concatenating them into one
		Stream<String> opstream = Stream.concat(alphabets.stream(), names.stream());

		// displaying the elements of the concatenated stream
		opstream.forEach(str -> System.out.print(str + " "));
	}

	// Filtering Collection without using Stream
	public static void filteringCollectionWithoutStreams() {
		List<Product> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = new ArrayList<Float>(); // constructing new list here
		for (Product product : productsList) {

			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data
	}

	// used collectors to compute sum of numeric values
	public static void collectasSum() {

		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		double totalPrice = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println(totalPrice);
	}
}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
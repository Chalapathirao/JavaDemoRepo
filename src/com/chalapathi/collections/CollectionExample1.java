package com.chalapathi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionExample1 {

	public static void main(String[] args) {
//		collection1();
//		collection2();
		// collection3();
		// collection4();
		// collection5();
		// collection6();
		// collection7();
		// collection8();
		// collection9();
		// collection10();
		collection11();
	}

	private static void collection1() {
		ArrayList<String> al = new ArrayList<String>(); // creating array list
		al.add("Jack"); // adding elements
		al.add("Tyler");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void collection2() {
		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		list.add("Mango"); // Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Traversing list through for-each loop
		for (String fruit : list)
			System.out.println(fruit);
	}

	private static void collection3() {

		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println("Traversing list through List Iterator:");
		// Here, element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});
	}

	private static void collection4() {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println(list);
		System.out.println(list.toString());
		System.out.println(Arrays.toString(list.toArray()));
	}

	private static void collection5() {
		// Creating a list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		// Sorting the list
		Collections.sort(list1);
		// Traversing list through the for-each loop
		for (String fruit : list1)
			System.out.println(fruit);

		System.out.println("Sorting numbers...");
		// Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		// Sorting the list
		Collections.sort(list2);
		// Traversing list through the for-each loop
		for (Integer number : list2)
			System.out.println(number);
	}

	private static void collection6() {
		LinkedList<String> al = new LinkedList<String>();// creating linked list
		al.add("Rachit"); // adding elements
		al.add("Rahul");
		al.add("Rajat");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void collection7() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		// accessing the element
		System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		al.set(1, "Dates");
		// Traversing list
		for (String fruit : al)
			System.out.println(fruit);
	}

	private static void collection8() {
		List<String> s1 = Arrays.asList(new String[] { "u", "i" });
		System.out.println(s1);
		String[] s = s1.toArray(new String[s1.size()]);
		System.out.println(Arrays.toString(s));
	}

	private static void collection9() {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("hello");
		set.add(null);
		set.add(null);
		System.out.println("set =" + set);

		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("hello");
		list.add(null);
		list.add(null);
		System.out.println("list" + list);
	}

	// Sorting HashMap by Keys using treemap
	private static void collection10() {
		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// Adding Key and Value pairs to HashMap
		hashmap.put(22, "A");
		hashmap.put(55, "B");
		hashmap.put(33, "Z");
		hashmap.put(44, "M");
		hashmap.put(99, "I");
		hashmap.put(88, "X");

		System.out.println("Before Sorting: printing");
		Set<Entry<Integer, String>> set = hashmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> pair = iterator.next();
			System.out.print(pair.getKey() + ": ");
			System.out.println(pair.getValue());
		}
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);
		
		System.out.println("After Sorting: printing");
		Set<?> set2 = map.entrySet();
		Iterator<?> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Entry pair = (Entry) iterator2.next();
			System.out.print(pair.getKey() + ": ");
			System.out.println(pair.getValue());
		}
	}

	// sorting HashMap by values using Comparator
	private static void collection11() {

	}
}

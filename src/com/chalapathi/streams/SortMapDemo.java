package com.chalapathi.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {

//		Map<String, Integer> map = new HashMap<>();
//		map.put("eight", 8);
//		map.put("four", 4);
//		map.put("ten", 10);
//		map.put("two", 2);

		// map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("****************************");
		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


//		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		/*
		 * for (Entry<String, Integer> entry : entries) {
		 * System.out.println(entry.getKey() + "   " + entry.getValue()); }
		 */

		Map<Employee5, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		employeeMap.put(new Employee5(176, "Roshan", "IT", 600000), 60);
		employeeMap.put(new Employee5(388, "Bikash", "CIVIL", 900000), 90);
		employeeMap.put(new Employee5(470, "Bimal", "DEFENCE", 500000), 50);
		employeeMap.put(new Employee5(624, "Sourav", "CORE", 400000), 40);
		employeeMap.put(new Employee5(284, "Prakash", "SOCIAL", 1200000), 120);

		System.out.println(employeeMap);

		employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee5::getDept).reversed()))
				.forEach(System.out::println);

	}
}

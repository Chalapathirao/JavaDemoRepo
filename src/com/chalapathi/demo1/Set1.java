package com.chalapathi.demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("hi");
		set.add("hello");
		set.add(null);
		set.add(null);
		System.out.println("set ="+set);
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hi");
		list.add("hello");
		list.add(null);
		list.add(null);
		System.out.println("list"+list);
	}

}

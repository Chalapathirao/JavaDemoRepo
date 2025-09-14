package com.chalapathi.corejava;

public class StringDemo {

	public StringDemo() {
		
	}
	public static void main(String[] args) {
		String a="hello";
		System.out.println(a.hashCode());
		a=a+"y";
		System.out.println(a.hashCode());
	}
	
}

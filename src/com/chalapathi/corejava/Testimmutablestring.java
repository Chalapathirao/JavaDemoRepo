package com.chalapathi.corejava;

public class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		//s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects
		System.out.println(s.concat(" Tendulkar"));
		
		String s1="Welcome";  
		String s2="Welcome";  
		String s3="Welcome"; 
		String s4 = new String("Welcome");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s4.intern());
	}
}
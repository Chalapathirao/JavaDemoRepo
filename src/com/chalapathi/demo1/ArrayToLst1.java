package com.chalapathi.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToLst1 {
	public static void main(String[] args) {
      
		 List<String> s1= Arrays.asList(new String[] {"u", "i"});
		 System.out.println(s1);
		 String[] s= s1.toArray(new String[s1.size()]);
		 System.out.println(s[0]); 
		 System.out.println(s[1]);
		 ArrayList<String> aList =new ArrayList<>();
	}
}

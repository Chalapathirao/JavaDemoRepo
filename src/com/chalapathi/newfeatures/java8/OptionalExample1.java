package com.chalapathi.newfeatures.java8;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {
		//String[] str1 = new String[10];
		//String lowercaseString1 = str1[5].toLowerCase();
		//System.out.print(lowercaseString1);

		String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) { // check for value is present or not
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else
			System.out.println("string value is not present");
	}

}

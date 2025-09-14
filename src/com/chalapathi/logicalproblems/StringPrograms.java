package com.chalapathi.logicalproblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StringPrograms {

	public static void main(String[] args) {
		// convertArrayToString();
		// removeduplicateCharsFromString();
		// checkTwoStringsAreAnagram();// two strings contains same characters but
		// different order
		reverseStringWithoutReverseMethod();
		// reverseStringByWords();
		// removeGivenCharacterFromString();
		// countTheWordsInString();
		// swapTwoStringsWithoutThirdVariable();
		//swapTwoNumberWithoutThirdVariable();
		// stringsCompare();
		// duplicateWordsAndItsOccurrencesInStringSentence();
		// noOfoccurancesOfChInString();
		// removeAllWhiteSpacesFromString();
		// findNoOfUpperLowerAndSpecialCharactersInAString();
		// proveStringsAreImmutable();
	}

	private static void stringsCompare() {
		String s1 = "tutorialspoint";
		String s2 = "tutorialspoint"; // Different reference created for same object
		String s3 = new String("tutorialspoint"); // creates new object
		System.out.println(s1 == s2);
		System.out.println(s2 == s3); // reference comparison

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3)); // both cases content comparison
		System.out.println();

		System.out.println(s1.compareTo(s2)); // The comparison is based on the Unicode value of
		// each character in the strings.
		System.out.println(s2.compareToIgnoreCase(s3));

	}

	// Removing duplicate string and printing occurrence of the repeated character
	private static void removeduplicateCharsFromString() {
		String inputString = "My name is ChalapathiRao davala!";
		Set<Character> hs = new HashSet<>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < inputString.length(); i++) {
			if (hs.add(inputString.charAt(i))) {
				sb.append(inputString.charAt(i));
				map.put(inputString.charAt(i), 1); // for occurrence
			} else {
				map.put(inputString.charAt(i), map.get(inputString.charAt(i)) + 1); // for occurrence
			}
		}
		System.out.println("duplicates removed string " + sb.toString());
		map.forEach((k, v) -> System.out.println(k + " ocrrued  " + v + " times"));

		// OR

		String duplicateString = Arrays.asList(inputString.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(duplicateString);

		// OR

		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			if (!result.contains(String.valueOf(inputString.charAt(i)))) {
				result += String.valueOf(inputString.charAt(i));
			}
		}
		System.out.println(result);
	}

	private static void convertArrayToString() {
		String[] stringArray = { "My", "name", "is", "Chalapathi", "!" };
		System.out.println(Arrays.toString(stringArray)); // Arrays.toString(arr)

		// OR

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < stringArray.length; i++) {
			stringBuilder.append(stringArray[i]);
		}
		System.out.println(stringBuilder.toString()); // stringBuilder.toString()

		// OR

		String str = String.join(" ", stringArray);
		System.out.println(stringBuilder.toString()); // String.join(" ", stringArray);

		// OR

		String str1 = Arrays.stream(stringArray).collect(Collectors.joining());
		System.out.println(str1);
	}

	private static void checkTwoStringsAreAnagram() {
		String firstString = "Army";
		String secondString = "mary";
		char[] firstStringCharArray = firstString.toLowerCase().toCharArray();
		char[] secondStringCharArray = secondString.toLowerCase().toCharArray();
		Arrays.sort(firstStringCharArray);
		Arrays.sort(secondStringCharArray);
		System.out.println(Arrays.equals(firstStringCharArray, secondStringCharArray));
	}

	private static void reverseStringWithoutReverseMethod() {// palindrome ->reverse of a sting is same with original
																// string
		String s = "Chalapathi"; // madam
		StringBuffer sb = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());

		// OR
		
		 char ch[]=s.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		   System.out.println(rev);
	}

	private static void reverseStringByWords() {
		String s = "my self is    chalapathi rao   davala";
		String[] arr = s.split("\\s+");
		StringBuffer sb = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(" ");
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}

	private static void removeGivenCharacterFromString() {
		String s = "SomeString";
		String ch = "t";
		String s1 = s.replace(ch, "");
		System.out.println(s1);
		// OR
		int pos = s.indexOf(ch);

		System.out.println(s.substring(0, pos) + s.substring(pos + 1));
	}

	private static void countTheWordsInString() {
		String s = "my self is chalapathi rao     davala";
		System.out.println(s.split("\\s+").length);
		// OR
		StringTokenizer stringTokenizer = new StringTokenizer(s);
		System.out.println(stringTokenizer.countTokens());
		// OR
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string = " + count);
	}

	private static void swapTwoStringsWithoutThirdVariable() {
		String firstString = "one";
		String secondString = "two";

		firstString = firstString + secondString; // step 1
		secondString = firstString.substring(0, (firstString.length() - secondString.length())); // step 2
		firstString = firstString.substring(secondString.length()); // step 3

		System.out.println(firstString);
		System.out.println(secondString);

	}

	// duplicate words and their number of occurrences in a string
	private static void duplicateWordsAndItsOccurrencesInStringSentence() {
		String s1 = "Bread butter and bread";
		String s2 = "Java is java again java is great";
		String s3 = "Super Man Bat Man Spider Man";
		String s = s2;

		String[] words = s.split("\\s+");
		Map<String, Integer> map = new HashMap<>();
		for (String string : words) {
			if (map.containsKey(string.toLowerCase())) {
				map.put(string.toLowerCase(), map.get(string.toLowerCase()) + 1);
			} else {
				map.put(string.toLowerCase(), 1);
			}
		}

		// printing map
		map.forEach((k, v) -> System.out.println(k + "  " + v));

	}

	private static void noOfoccurancesOfChInString() {
		String s = "Java is Java again Java again";
		char ch = 'g';
		int count = s.length() - s.replace(Character.toString(ch), "").length();
		System.out.println("Number of occurances of 'a' in " + s + " = " + count);
	}

	// remove all white spaces from a string
	private static void removeAllWhiteSpacesFromString() {
		String s = "Java   is Java     again Java again   ";
		String s1 = s.replaceAll("\\s+", "");
		System.out.println(s);
		System.out.println(s1);
	}

	// To Find The Uppercase Letters, Lowercase Letters, Digits And Other Special
	// Characters In A String

	private static void findNoOfUpperLowerAndSpecialCharactersInAString() {
		String s = "My e-mail : eMail_Address321897@anymail.com";
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		int letters = 0;
		int digits = 0;
		int others = 0;
		int spaces = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				digits++;
			} /*
				 * else if (Character.isLetter(s.charAt(i))) { letters++; }
				 */
			else if (Character.isLowerCase(s.charAt(i))) {
				lowerCaseLetters++;
			} else if (Character.isUpperCase(s.charAt(i))) {
				upperCaseLetters++;
			} else if (Character.isSpaceChar(s.charAt(i))) {
				spaces++;
			} else {
				others++;
			}
		}
		System.out.println("No of Letters " + letters);
		System.out.println("No of Upper case Letters " + upperCaseLetters);
		System.out.println("No of Lower case Letters " + lowerCaseLetters);
		System.out.println("No of Digits " + digits);
		System.out.println("No of Spaces " + spaces);
		System.out.println("No of Other special characters " + others);
	}

	private static void proveStringsAreImmutable() {
		String s1 = "JAVA";
		String s2 = "JAVA";
		System.out.println(s1 == s2); // Output : true , Reference check
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1 = s1 + "J2EE";
		System.out.println(s1 == s2); // Output : false
		System.out.println(s1.hashCode());
	}

	private static void swapTwoNumberWithoutThirdVariable() {
		int x = 7;
		int y = 20;
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println();
		
	}
}

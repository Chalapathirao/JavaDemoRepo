package com.chalapathi.newfeatures.java8;

import java.util.Optional;

public class OptionalEx1 {
	public static void main(String[] args) {
		String[] str1 = new String[10];
		// Getting the substring
		/*
		 * String str3 = str1[9].substring(2, 5); // Displaying substring
		 * System.out.print(str3);
		 */
		
		
		Optional<String> isNull = Optional.ofNullable(str1[9]);        
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str1[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }                
	      str1[9] = "AgraIsCool";       
	      Optional<String> isNull2 = Optional.ofNullable(str1[9]);       
	      if(isNull2.isPresent()){        
	         //Getting the substring            
	         String str2 = str1[9].substring(2, 5);            
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);          
	      }         
	      else{         
	         System.out.println("Cannot get the substring from an empty string");         
	      }    
	}
}

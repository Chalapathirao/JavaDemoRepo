package com.chalapathi.newfeatures.java8;

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionExample1 {
	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));
		
		
		 // Lambda expression with return keyword.    
        Addable ad3=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad3.add(107,200));  
	}
}

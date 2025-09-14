package com.chalapathi.logicalproblems;

public class NumberPrograms {

	public static void main(String[] args) {

//		reverseOfAnumber(23649);
//		palindrome(151);
//		palindrome(347);

//		armstrongNumberCheck(153);
//		armstrongNumberCheck(125);
//		armstrongNumberCheck(1634);
		//printAllArmStrongNumbersBetween(1, 10000);
		// factorial(5);
		// factorialUsingRecursive(5);
		//checkPrimeNumber(4);
		printAllPrimenumbersBetween(1, 100);
	}

	private static int reverseOfAnumber(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		return rev;
	}

	private static void palindrome(int num) {
		if (num == reverseOfAnumber(num)) {
			System.out.println("yes its palindrome number");
		} else {
			System.out.println("No its not palindrome number");
		}
	}

	private static boolean armstrongNumberCheck(int num) {
		int sum = 0;
		int rem = 0;
		int temp = num;
		int digits = 0;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		temp = num;
		while (num != 0) {
			rem = (num % 10);
			sum = sum + (int) Math.pow(rem, digits);
			num = num / 10;
		}
		// System.out.println("Sum = " + sum);
		if (temp == sum) {
			// System.out.println("Yes "+temp+" is Armstrong Number");
			return true;
		} else {
			// System.out.println("No "+temp+" is not Armstrong Number");
			return false;
		}
	}

	private static void printAllArmStrongNumbersBetween(int num1, int num2) {
		for (int i = num1; i < num2; i++) {
			if (armstrongNumberCheck(i)) {
				System.out.print(" " + i);
			}
		}
	}

	private static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	private static void factorialUsingRecursive(int num) {
		System.out.println(fact(num));
	}

	private static int fact(int num) {
		int fact = num;
		if (num == 1) {
			return num;
		} else {
			return fact * fact(num - 1);
		}
	}

	private static boolean checkPrimeNumber(int num) {
		boolean flag = true;
		if (num == 1 || num == 2) {
			//System.out.println("not prime");
			flag = false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					//System.out.println("not prime");
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			//System.out.println("prime");
		}
      return flag;
	}

	private static void printAllPrimenumbersBetween(int num1, int num2) {
		for (int i = num1; i < num2; i++) {
			if (checkPrimeNumber(i)) {
				System.out.print(" " + i);
			}
		}
	}
	
}

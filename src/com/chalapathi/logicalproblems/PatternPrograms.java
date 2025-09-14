package com.chalapathi.logicalproblems;

public class PatternPrograms {

	public static void main(String[] args) {
		//pattern1(6);
		pattern2(6);
	}

	private static void pattern1(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	private static void pattern2(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(" ");
			for (int j = i; j <= num-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

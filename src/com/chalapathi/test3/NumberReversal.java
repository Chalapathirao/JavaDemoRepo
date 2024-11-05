package com.chalapathi.test3;

public class NumberReversal {
    public static int reverseNumber(int number) {
        int reversed = 0;  // This will hold the reversed number
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append it to the reversed number

            number /= 10;  // Remove the last digit from the original number
        }
        return reversed;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }
}

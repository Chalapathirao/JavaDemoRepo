package com.chalapathi.problemsolving;

public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(reverseMethod1("Hello"));
//        System.out.println(reverseMethod2("Hello"));
  //      System.out.println(reverseUsingRecursive("Hello"));
        System.out.println(reverseUsingRecursive("/gH?yZx => /xZ?yHg"));
    }

    static String reverseMethod1(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i= str.length()-1; i >=0 ; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    static String reverseMethod2(String str) {
        // Using StringBuilder's reverse method
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    static String reverseUsingRecursive(String str) {
        if(str.isEmpty()){
            return str;
        }
        return reverseUsingRecursive(str.substring(1))+ String.valueOf(str.charAt(0));
    }

}

package com.chalapathi.problemsolving;

public class InternExample {
    public static void main(String args[]){
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1 == s2);//false because reference variables are pointing to different instance
        System.out.println(s2 == s3);//true because reference variables are pointing to same instance


        String str1 = "String";
        String str2 = new String("String");
        String str3 = new String("String").intern();
        System.out.println();
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);// true
        System.out.println(str2 == str3);//false
        System.out.println(str2.equals(str3));// true
        System.out.println();
        calculate(10, 5);
    }

    public static void calculate(Integer a, Integer b) {
        final int l;
        System.out.println("Result is: " + (a - b));
    }

    public static void calculate(int a, int b) {
        System.out.println("Result is: " + (a + b));
    }


}

package com.chalapathi.test3;

public class StringExample2 {
    public static void main(String args[]) {
        String s1 = "java";//creating string by Java string literal
        String s2 = new String("java");//creating Java string by new keyword
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}

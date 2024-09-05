package com.chalapathi.test3;

public class Teststringcomparison1{
    public static void main(String[] args){
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        String s5="Sachin";
        String s6="SACHIN";

        System.out.println(s5.equals(s6));//false
        System.out.println(s5.equalsIgnoreCase(s6));//true

        comparing();
    }

    static void comparing(){
        System.out.println("in comparing()");
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }
}

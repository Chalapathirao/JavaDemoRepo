//A functional interface can have methods of object class. See in the following example.

package com.chalapathi.newfeatures.java8;

@FunctionalInterface  
interface sayableF1{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
public class FunctionalInterfaceExample1 implements sayableF1{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample1 fie = new FunctionalInterfaceExample1();  
        fie.say("Hello there");  
    }  
}  

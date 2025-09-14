package com.chalapathi.newfeatures.java8;

interface SayableM{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
    	SayableM sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  

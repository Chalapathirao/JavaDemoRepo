package com.chalapathi.newfeatures.java8;

interface SayableD1{  
    // Default method   
   default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
public class DefaultMethods implements SayableD1{  
    public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	SayableD1 dm = new DefaultMethods();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
        dm.say();
    }  
    public void say(){  
    	System.out.println("Hello, this is default method overriden");  
    }  
} 
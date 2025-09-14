package com.chalapathi.newfeatures.java8;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
} 
//a functional interface is extending to a non-functional interface.
@FunctionalInterface  
interface SayableF3 extends Doable{  
    void say(String msg);   // abstract method  
}  
public class FunctionalInterfaceExample3 implements SayableF3{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  

package com.chalapathi.newfeatures.java8;

interface SayableInst{  
    void say();  
}  
public class InstanceMethodReference {  
    public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
    public static void main(String[] args) {  
        InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating object  
        // Referring non-static method using reference  
        SayableInst sayable = methodReference::saySomething;  
        // Calling interface method  
            sayable.say();  
            // Referring non-static method using anonymous object  
            SayableInst sayable2 = new InstanceMethodReference()::saySomething; // You can use anonymous object also  
            // Calling interface method  
            sayable2.say();  
    }  
} 

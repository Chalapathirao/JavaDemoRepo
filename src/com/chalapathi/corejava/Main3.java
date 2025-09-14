package com.chalapathi.corejava;

public class Main3{  
    public static void main(String []args) {  
       try{  
           int a = 1; 
           System.out.println("before exception");
           System.out.println(a/0); 
           System.out.println("after exception in try");
       }  
       catch (Exception e) {
    	   System.out.println("in catch "+e);
	   }
       finally  
       {  
           System.out.println("Final");  
       }  
       System.out.println("after exception");
    }  
}  

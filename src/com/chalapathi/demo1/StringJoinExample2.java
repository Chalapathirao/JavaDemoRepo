package com.chalapathi.demo1;

public class StringJoinExample2 {  
    public static void main(String[] args) {          
        String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
        
        System.out.println(time.hashCode());
        
    }  
}  

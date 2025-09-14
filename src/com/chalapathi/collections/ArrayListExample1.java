package com.chalapathi.collections;

import java.util.ArrayList;
import java.util.Collection;  
public class ArrayListExample1{  
public static void main(String args[]){  
 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
     list.add("Mango");//Adding object in arraylist    
     list.add("Apple");    
     list.add("Banana");    
     list.add("Grapes");    
     //Printing the arraylist object   
     System.out.println(list);  
     System.out.println(list.toString()); 
     System.out.println(list.toArray()); 
     
}  
} 

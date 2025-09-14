package com.chalapathi.demo1;

import java.util.*;   
public class SortArrayListExample1  
{   
public static void main(String args[])   
{   
// creating object of ArrayList class  
ArrayList<String> list = new ArrayList<String>();   
// adding elements to the ArrayList   
list.add("Volkswagen");   
list.add("Toyota");   
list.add("Porsche");   
list.add("Ferrari");   
list.add("Mercedes-Benz");   
list.add("Audi");   
list.add("Rolls-Royce");  
list.add("BMW");  
// printing the unsorted ArrayList   
System.out.println("Before Sorting: "+ list);   
// Sorting ArrayList in ascending Order   
Collections.sort(list);   
// printing the sorted ArrayList   
System.out.println("After Sorting: "+ list);   



Collections.sort(list, Collections.reverseOrder());   
//Print the sorted ArrayList   
System.out.println("After Sorting in desc order: "+ list);  

System.out.println(list.hashCode());

}   
}  
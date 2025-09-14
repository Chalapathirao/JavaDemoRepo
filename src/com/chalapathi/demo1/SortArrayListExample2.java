package com.chalapathi.demo1;

import java.util.*;  
public class SortArrayListExample2  
{  
public static void main(String args[])  
{  
//creating an object of ArrayList class  
ArrayList<Integer> list = new ArrayList<Integer>();  
list.add(55);  
list.add(34);  
list.add(98);  
list.add(67);  
list.add(39);  
list.add(76);  
list.add(81);  
//printing ArrayList before sorting  
System.out.println("ArrayList Before Sorting:");  
for(int marks: list)  
{  
System.out.println(marks);  
}  
//sorting ArrayList in ascending order  
Collections.sort(list);  
//printing ArrayList after sorting  
System.out.println("ArrayList After Sorting:");  
for(int marks: list)  
{  
System.out.println(marks);  
}  
}  
}  

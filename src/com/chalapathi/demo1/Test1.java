package com.chalapathi.demo1;

import java.util.*;  
import java.io.*;  
public class Test1 {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    //  reader.
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  
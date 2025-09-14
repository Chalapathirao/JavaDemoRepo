package com.chalapathi.demo1;

import java.io.*;  
import java.util.*;  
public class ArrayList6 {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ravi");    
          al.add("Vijay");    
          al.add("Ajay");    
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("file.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(al);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file.txt");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  list=(ArrayList)ois.readObject();  
            System.out.println(list);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
       }  
    } 
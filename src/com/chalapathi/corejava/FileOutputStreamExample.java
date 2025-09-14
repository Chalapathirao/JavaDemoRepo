package com.chalapathi.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;    
public class FileOutputStreamExample {    
    public static void main(String args[]){      
           try{      
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");      
             fout.write(65);      
             fout.close();      
             System.out.println("success..."); 
             FileInputStream fin=new FileInputStream("D:\\testout.txt");      
             int i=fin.read();    
             System.out.print((char)i);      
     
             fin.close();   
            }catch(Exception e){System.out.println(e);}      
      }      
}

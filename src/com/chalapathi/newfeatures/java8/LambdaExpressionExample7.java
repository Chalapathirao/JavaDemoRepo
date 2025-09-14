//Java Lambda Expression Example: Foreach Loop

package com.chalapathi.newfeatures.java8;

import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        
        List<String> list1 = Arrays.asList(new String[] {"hello", "hi"});
        list1.forEach(n->System.out.println(n));
        
        Arrays.asList(new String[] {"chalapathi", "chalu"}).forEach(n->System.out.println(n));
    }  
}  

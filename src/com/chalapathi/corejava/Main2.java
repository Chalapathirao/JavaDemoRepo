package com.chalapathi.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

abstract class Calculate  
{  
	int a;
    abstract int multiply(int a, int b);  
}  
 interface Calculate1  
{     
	  public static final int h = 0;
	  static void Calculate(){
	 }
	 public static final int b = 0;
    abstract int multiply(int a, int b);  
}  
public class Main2
{  
	public Main2() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args)  
    {  
        int result = new Calculate()  
        {      
            @Override  
            int multiply(int a, int b)  
            {  
                return a*b;  
            }  
        }.multiply(6,7);  
        System.out.println("result = "+result);  
        
        Calculate1 cal1 = (a, b) -> a*b;
        System.out.println(cal1.multiply(5, 6));
        String s= new String("hi");
        List <String> list= new ArrayList<>();
    }  
}  

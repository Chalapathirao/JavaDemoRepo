package com.chalapathi.corejava;

public class ExceptionHandlingExample {  
public static void main(String args[])  
{  
    try  
    {  
        int a = 1/0;  
        System.out.println("a = "+a);  
    }  
    catch(ArithmeticException ex){System.out.println(ex);}   
    catch(Exception e){System.out.println(e);}  
    
}  
} 


 

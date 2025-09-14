package com.chalapathi.corejava;

class Base   
{  
    public void baseMethod()  
    {  
        System.out.println("BaseMethod called ...");  
    }  
}  
class Derived extends Base   
{  
    public void baseMethod()  
    {  
        System.out.println("Derived method called ...");  
    }  
}  
public class Test   
{  
    public static final void main (String args[])  
    {  
        Base b = new Derived();  
        b.baseMethod();  
        
        Base b1 = (Base)new Derived();  
        b1.baseMethod(); 
        
        Derived b2 = new Derived();  
        b2.baseMethod(); 
        
        Base b3= new Base();
        b3.baseMethod();
        
        Derived b4= (Derived) new Base();
        b4.baseMethod();
    }  
}  

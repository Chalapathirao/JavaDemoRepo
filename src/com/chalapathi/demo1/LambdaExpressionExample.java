package com.chalapathi.demo1;
interface Drawable{  
    public void draw();  
}  

interface Sayable{  
    public String say();  
}

interface Sayable1{  
    public String say(String name);  
} 

interface Addable{  
    int add(int a,int b);  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
        
        
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
        
        
        Sayable s=()->{  
            return "I have nothing to say.";  
        };  
        System.out.println(s.say());  
        
        
        
        // Lambda expression with single parameter.  
        Sayable1 s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable1 s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo"));  
        
        
     // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
        
        
        // Lambda expression without return keyword.  
        Addable ad3=(a,b)->(a+b);  
        System.out.println(ad3.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad4=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad4.add(100,200));  
    }  
} 
package com.chalapathi.corejava;

class A1{  
A1 get(){return this;}  
void hello() {
	System.out.println(1);
}
}  
  
class B1 extends A1{  
A1 get(){return this;}  
//B1 get(){return this;}  
void message(){System.out.println("welcome to covariant return type");}  
  
public static void main(String args[]){  
//new B1().get().message();
new B1().get().hello();
}  
}

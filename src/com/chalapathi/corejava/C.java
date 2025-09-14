package com.chalapathi.corejava;

interface A{  
void msg(); 
}  
interface B{  
void msg();
}  
class C implements A,B{  
   
 public static void main(String args[]){  
   C obj=new C();  
   //obj.msg();//Now which msg() method would be invoked?  
}

@Override
public void msg() {
	// TODO Auto-generated method stub
	
}  
}  

package com.chalapathi.demo1;
import java.lang.reflect.Constructor;

public class Contest1 {

	public Contest1() {
		System.out.println("default no arg consturucture");
	}

	public static void main(String[] args) {
      new Contest1();
      try {
		Class class1=Class.forName("java.lang.reflect.Constructor");
		//class1.getConstructor(parameterTypes)
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

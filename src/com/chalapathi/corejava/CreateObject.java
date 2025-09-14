package com.chalapathi.corejava;

public class CreateObject {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("com.chalapathi.JBTClass");
			JBTClass obj = (JBTClass) cls.newInstance();
			JBTClass obj1 = (JBTClass) cls.newInstance();

			System.out.println(obj);
			System.out.println(obj1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

class JBTClass {
	static int j = 10;

	JBTClass() {
		i = j++;
	}

	int i;

	@Override
	public String toString() {
		return "Value of i :" + i;
	}
}
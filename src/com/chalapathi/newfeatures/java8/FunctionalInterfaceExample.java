package com.chalapathi.newfeatures.java8;

@FunctionalInterface
interface sayable5 {
	void say(String msg);
}

public class FunctionalInterfaceExample implements sayable5 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there");
	}
}

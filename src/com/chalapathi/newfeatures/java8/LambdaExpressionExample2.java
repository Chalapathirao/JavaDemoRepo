//Java Lambda Expression Example

package com.chalapathi.newfeatures.java8;

@FunctionalInterface
interface Drawable1 {
	public void draw();
}

public class LambdaExpressionExample2 {
public static void main(String[] args) {
	int width=10;  
	Drawable1 drawable = () ->  System.out.println("Drawing "+width);
	drawable.draw();
}
}

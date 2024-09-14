package com.chalapathi.test7;

interface Drawable {
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
        //with lambda
        Drawable d1 = () -> System.out.println("Drawing " + width);
        d1.draw();
    }
}

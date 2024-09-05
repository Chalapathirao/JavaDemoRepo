package com.chalapathi.test1;



interface Drawable1 {
    void draw();
}

class Circle1 implements Drawable1 {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle1 implements Drawable1 {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class RumtimePolimorphismThroughInterfaces {
    public static void main(String[] args) {
        Drawable1 shape = new Circle1();
        shape.draw();  // Output: Drawing Circle

        shape = new Rectangle1();
        shape.draw();  // Output: Drawing Rectangle
    }
}

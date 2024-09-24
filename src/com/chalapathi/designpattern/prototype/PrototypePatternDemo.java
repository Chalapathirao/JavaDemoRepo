package com.chalapathi.designpattern.prototype;

interface Shape {
    void draw();
    Shape clone();
}

class Circle implements Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(x, y, radius);
    }
}

class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(x, y, width, height);
    }
}

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle(100, 100, 50);
        Shape rectanglePrototype = new Rectangle(200, 200, 100, 50);

        Shape circle1 = circlePrototype.clone();
        Shape circle2 = circlePrototype.clone();
        Shape rectangle1 = rectanglePrototype.clone();

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
    }
}

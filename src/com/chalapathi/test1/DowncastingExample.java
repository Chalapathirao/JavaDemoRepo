package com.chalapathi.test1;

import java.util.ArrayList;
import java.util.List;

public class DowncastingExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 3));

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circle area: " + circle.calculateArea());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle area: " + rectangle.calculateArea());
            }
        }
    }
}

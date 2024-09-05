package com.chalapathi.test2;

class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {  // Method hiding, not overriding
        System.out.println("Static method in Child class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();  // Output: Static method in Parent class
    }
}

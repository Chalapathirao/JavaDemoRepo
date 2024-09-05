package com.chalapathi.test1;


class CompiletimePolymorphism {
    // Method with one parameter
    public int add(int a) {
        return a + a;
    }

    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        CompiletimePolymorphism math = new CompiletimePolymorphism();
        System.out.println(math.add(5));           // Output: 10
        System.out.println(math.add(5, 10));       // Output: 15
        System.out.println(math.add(5, 10, 15));   // Output: 30
    }
}


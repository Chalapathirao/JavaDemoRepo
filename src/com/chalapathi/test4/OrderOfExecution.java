package com.chalapathi.test4;

public class OrderOfExecution {
    static {
        System.out.println("Static block executed.");
    }

    {
        System.out.println("Instance initializer block executed.");
    }

    public OrderOfExecution() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        OrderOfExecution obj1 = new OrderOfExecution();
        OrderOfExecution obj2 = new OrderOfExecution();
    }
}

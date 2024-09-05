package com.chalapathi.test1;



public class OrderOfBlocksAndConstructor extends ParentOrder {
    static {
        System.out.println("Static Block1");
    }
    static {
        System.out.println("Static Block2");
    }

    {
        System.out.println("Instance Initializer Block1");
    }
    {
        System.out.println("Instance Initializer Block2");
    }

    public OrderOfBlocksAndConstructor() {
        super();
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new OrderOfBlocksAndConstructor();
        new OrderOfBlocksAndConstructor();
    }
}
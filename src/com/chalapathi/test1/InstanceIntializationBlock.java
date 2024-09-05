package com.chalapathi.test1;


class InstanceIntializationBlock {
    int speed;
    static int a ;

    static {
        System.out.println("in static block ");
        a =1000;
    }

    static {
        System.out.println("another static block");
    }

    InstanceIntializationBlock() {
        System.out.println("in constructor");
        System.out.println("speed is " + speed);
    }

    {
        System.out.println("in Instance Intialization Block");
        speed = 100;
    }
    {
        System.out.println("another instnce Intialization block..");
    }
    public static void main(String args[]) {
        InstanceIntializationBlock b1 = new InstanceIntializationBlock();
        InstanceIntializationBlock b2 = new InstanceIntializationBlock();
    }
}
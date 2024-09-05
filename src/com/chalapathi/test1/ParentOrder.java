package com.chalapathi.test1;

public class ParentOrder {
    ParentOrder(){
        System.out.println("ParentOrder constructor");
    }

    static {
        System.out.println("ParentOrder static");
    }
    {
        System.out.println("ParentOrder instance block");
    }


}

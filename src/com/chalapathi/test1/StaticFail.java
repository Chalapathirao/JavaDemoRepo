package com.chalapathi.test1;

public class StaticFail {
    static {
        System.out.println("in static");
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("un checked exception here");
        }
    }
    static {
        System.out.println("in static");
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("checked exception here");
        }
    }

    /*static {
        throw new RuntimeException();
    }*/


    public static void main(String[] args) {
        System.out.println("started....");
    }
}

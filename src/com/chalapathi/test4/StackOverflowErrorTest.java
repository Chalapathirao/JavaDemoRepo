package com.chalapathi.test4;

public class StackOverflowErrorTest {
    public StackOverflowErrorTest(){
        new StackOverflowErrorTest();
    }

    public static void main(String[] args) {
        new StackOverflowErrorTest();
    }
}

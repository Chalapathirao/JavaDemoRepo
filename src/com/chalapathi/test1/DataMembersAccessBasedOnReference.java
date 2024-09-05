package com.chalapathi.test1;

class Parent2 {
    int value = 10;
}

class Child2 extends Parent2 {
    int value = 20;
}

public class DataMembersAccessBasedOnReference {
    public static void main(String[] args) {
        Parent2 parent = new Child2();
        System.out.println(parent.value);  // Output: 10
    }
}



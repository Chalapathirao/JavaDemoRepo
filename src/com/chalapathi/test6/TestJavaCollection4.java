package com.chalapathi.test6;

import java.util.*;
public class TestJavaCollection4{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        //stack.pop();
        stack.addFirst("chhhh");
        System.out.println(stack);
    }
}

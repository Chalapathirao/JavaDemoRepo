package com.chalapathi.Test8;

import java.util.Stack;

public class ParenthesesChecker {

    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "({[]})";
        String str2 = "([)]";

//        if (isValidParentheses(str1)) {
//            System.out.println("String 1 is valid.");
//        } else {
//            System.out.println("String 1 is invalid.");
//        }

        if (isValidParentheses(str2)) {
            System.out.println("String 2 is valid.");
        } else {
            System.out.println("String 2 is invalid.");
        }
    }
}

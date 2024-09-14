package com.chalapathi.test6;

import java.util.Arrays;

public enum Season {
    WINTER, SPRING, SUMMER, FALL;
    public static void main(String[] args) {
        Season s=Season.WINTER;
        System.out.println(s);
        System.out.println(Arrays.toString(Season.values()));
    }
}

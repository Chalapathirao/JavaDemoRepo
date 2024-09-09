package com.chalapathi.test4;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        findLarestNumber(new int[]{67, 5, 44, 41, 6, 1, 3, 34, 23, 77, 0, 88, 7, 4});
    }

    static void findLarestNumber(int[] number) {
        int max= Arrays.stream(number).max().getAsInt();
        System.out.println("max number = "+max);
    }
}

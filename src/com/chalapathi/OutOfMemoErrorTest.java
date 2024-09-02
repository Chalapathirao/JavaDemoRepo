package com.chalapathi;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OutOfMemoErrorTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Random random = new Random();
        while (true){
            map.put(random.nextInt(), "NextrandomValue"+random.nextInt());
        }

     }
}

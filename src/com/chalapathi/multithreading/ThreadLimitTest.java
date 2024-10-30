package com.chalapathi.multithreading;

public class ThreadLimitTest {
    public static void main(String[] args) {
        int count = 0;
        try {
            while (true) {
                count++;
                new Thread(() -> {
                    try {
                        Thread.sleep(Long.MAX_VALUE);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
                System.out.println("Thread count: " + count);
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Reached maximum number of threads: " + count);
            e.printStackTrace();
        }
    }
}


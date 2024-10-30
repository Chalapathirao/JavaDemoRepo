package com.chalapathi.multithreading;

public class SleepExample {
    public static void main(String[] args) {
        Thread taskThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("first Task execution step " + i);
                try {
                    // Pause the thread for 1 second (1000 milliseconds)
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("first Task interrupted");
                }
            }
            System.out.println("first Task completed.");
        });

        Thread task2Thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("2nd Task execution step " + i);
                // Pause the thread for 1 second (1000 milliseconds)
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("second Task completed.");
        });

        // Start the thread
        taskThread.start();
        task2Thread.start();
    }
}


package com.chalapathi.multithreading;

import java.time.LocalDateTime;

public class SleepAndWait {
    public static void main(String[] args) {
        //sleepTest();
        waitTest();
    }

    private static void waitTest() {
        Object lock = new Object();
        LocalDateTime start = LocalDateTime.now();
        System.out.println(STR."Thread started at: \{start}");
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println(STR."Waiting for notification at: \{LocalDateTime.now()}");
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread notifyingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000); // Simulate some processing time
                    lock.notify(); // Notify waiting thread
                    System.out.println(STR."Notification sent at: \{LocalDateTime.now()}");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        waitingThread.start();
        notifyingThread.start();

        // Wait for threads to finish
        try {
            waitingThread.join();
            notifyingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LocalDateTime end = LocalDateTime.now();
        System.out.println("Thread finished at: " + end);
    }

    private static void sleepTest() {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(STR."Thread started at: \{start}");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println(STR."Thread resumed after sleep at: \{end}");
    }
}

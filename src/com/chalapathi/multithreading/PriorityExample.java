package com.chalapathi.multithreading;

public class PriorityExample {
    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Low-priority thread running: "+Thread.currentThread().getPriority());
            }
        });

        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("High-priority thread running: "+Thread.currentThread().getPriority());
            }
        });

        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Priority 1
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10

        lowPriorityThread.start();
        highPriorityThread.start();
    }
}


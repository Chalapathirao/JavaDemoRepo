package com.chalapathi.multithreading;

public class YieldExample {
    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                System.out.println("Producer producing item " + i);
                // Yield to allow consumer a chance to run
                Thread.yield();
            }
            System.out.println("Producer finished producing.");
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                System.out.println("Consumer consuming item " + i);
                // Yield to allow producer a chance to run
                Thread.yield();
            }
            System.out.println("Consumer finished consuming.");
        });

        producer.start();
        consumer.start();
    }
}

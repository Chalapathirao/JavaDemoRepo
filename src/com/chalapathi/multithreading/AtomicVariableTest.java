package com.chalapathi.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableTest {
    static int count1= 0;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
                count1++;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
                count1++;
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + count.get());  // Should print 2000 if atomic operations are used correctly
        System.out.println("Count1: " + count1);
    }
}


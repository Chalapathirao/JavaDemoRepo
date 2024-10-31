package com.chalapathi.multithreading;

import static java.lang.Thread.sleep;

class Counter {
    private int count = 0;

    public synchronized void increment() { // Only one thread can access this method at a time
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
                counter.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Count: " + counter.getCount());  // Should print 2000 if synchronized correctly
    }
}


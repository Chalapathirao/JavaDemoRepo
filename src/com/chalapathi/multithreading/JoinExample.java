package com.chalapathi.multithreading;

public class JoinExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 1 completed.");
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Thread 2 completed.");
        });

        thread1.start();
        thread2.start();

        try {
            // Main thread will wait for thread1 to finish
            thread1.join();
            System.out.println("Thread 1 has finished. Main thread continues.");

            // Main thread will wait for thread2 to finish
            thread2.join();
            System.out.println("Thread 2 has finished. Main thread continues.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads completed. Main thread exiting.");
    }
}


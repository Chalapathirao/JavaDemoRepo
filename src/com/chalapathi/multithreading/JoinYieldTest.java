package com.chalapathi.multithreading;

public class JoinYieldTest {
    public static void main(String[] ignoredArgs) {
        //joinTest();
        yieldTest();
    }

    private static void joinTest() {
        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(STR."Worker: \{i}");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });

        worker.start();
        try {
            worker.join();  // main waits until worker finishes
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread resumes after worker completes");
    }

    private static void yieldTest() {
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(STR."\{Thread.currentThread().getName()} : \{i}");
                Thread.yield(); // Hint to give other threads a chance
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

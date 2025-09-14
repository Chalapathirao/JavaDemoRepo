package com.chalapathi.newfeatures.java21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadsTest1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Thread vThread = Thread.ofVirtual().name("MyVirtualThread").start(() -> {
            System.out.println(STR."Thread name= \{Thread.currentThread().getName()}");
            System.out.println("Hello from virtual thread");
        });
        vThread.join(); // Wait for completion
        System.out.println(STR."Thread name= \{Thread.currentThread().getName()}");
        Thread.Builder builder = Thread.ofVirtual().name("MyVirtualThread1");
        Thread t = builder.start(() -> System.out.println("Running named virtual thread"));
        System.out.println(STR."Thread name: \{t.getName()}");
        //t.setDaemon(false);
        //t.setPriority(1); no effect
        System.out.println(t.getThreadGroup());
        t.join();

        Thread t1 = Thread.ofVirtual().unstarted(() -> System.out.println("Unstarted virtual"));
        t1.start();
        t1.join();


        Thread.startVirtualThread(() ->
                System.out.println("Quick virtual thread")
        ).setName("vthread");

        Runnable runnable = () -> System.out.println("Inside Runnable");   // Task to run
        Thread vThread1 = Thread.startVirtualThread(runnable);

        Thread vThread2 = Thread.startVirtualThread(() -> {
            //Code to execute in virtual thread
            System.out.println("Inside Runnable");
        });


        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future = executor.submit(() -> {
                        Thread.currentThread().setName("hello1");
                        System.out.println(STR."Thread name= \{Thread.currentThread().getName()}");
                        System.out.println("Task in virtual thread via Executor");
                    }
            );
            future.get(); // Waits for task to complete
        }

    }
}

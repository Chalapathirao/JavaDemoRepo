package com.chalapathi.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest5 {
    public static void main(String[] args) {
        // Create a ScheduledThreadPoolExecutor with 2 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        System.out.println("started");
        // Schedule a task with a 2-second delay
        Runnable task1 = () -> System.out.println("Executing task after a delay by : "+Thread.currentThread().getName());
        scheduler.schedule(task1, 5, TimeUnit.SECONDS);

        // Schedule a task to run every 5 seconds
        Runnable periodicTask = () -> System.out.println("Executing periodic task");
        scheduler.scheduleAtFixedRate(periodicTask, 0, 10, TimeUnit.SECONDS);

        // To allow the program to run for some time before shutdown
        try {
            Thread.sleep(50000); // Run for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the scheduler after the task is executed
        scheduler.shutdown();
    }
}
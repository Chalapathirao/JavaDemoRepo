package com.chalapathi.concurrent;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {
        // Create a ScheduledExecutorService with 1 thread
       // ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        ScheduledExecutorService scheduler = new ScheduledThreadPoolExecutor(10);


        // Schedule a task to run after an initial delay of 2 seconds
        scheduler.schedule(new RunnableTask("One-time Task"), 2, TimeUnit.SECONDS);

        // Schedule a task to run repeatedly every 3 seconds after an initial delay of 1 second
        scheduler.scheduleAtFixedRate(new RunnableTask("Fixed-Rate Task"), 1, 3, TimeUnit.SECONDS);

        // Schedule a task to run repeatedly with a 2-second delay between the end of one execution and the start of the next
        scheduler.scheduleWithFixedDelay(new RunnableTask("Fixed-Delay Task"), 1, 2, TimeUnit.SECONDS);

        // Shutdown the scheduler after 10 seconds to stop all tasks
        /*scheduler.schedule(() -> {
            System.out.println("Shutting down scheduler...");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);*/
    }

    // A simple task that implements Runnable
    static class RunnableTask implements Runnable {
        private String taskName;

        public RunnableTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println(taskName + " is being executed at " + LocalDateTime.now());
        }
    }
}


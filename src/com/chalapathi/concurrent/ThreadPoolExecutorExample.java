package com.chalapathi.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with 2 core threads and a maximum of 4 threads

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                      // Core thread pool size
                4,                      // Maximum thread pool size
                10,                     // Time that excess idle threads will wait for new tasks before terminating
                TimeUnit.SECONDS,        // Keep-alive time unit
                new LinkedBlockingQueue<>()  // Task queue
        );

        // ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        //OR
        // Submit 5 tasks to the executor
        for (int i = 0; i < 5; i++) {
            Runnable task = new Task("Task " + i);
            System.out.println("Submitting " + task);
            executor.execute(task); // Execute the task using the thread pool
        }

        // Shutdown the executor after tasks are submitted
        executor.shutdown();
        try {
            // Wait for all tasks to finish
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }

    // A simple task that implements Runnable
    static class Task implements Runnable {
        private String name;

        public Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is being executed by " + Thread.currentThread().getName());
                Thread.sleep(2000); // Simulate some work with sleep
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        @Override
        public String toString() {
            return name;
        }
    }
}


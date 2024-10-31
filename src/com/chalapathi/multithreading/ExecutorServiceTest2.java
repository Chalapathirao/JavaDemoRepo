package com.chalapathi.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();  // Create a pool of 3 threads
        Callable<Integer> task = () -> {
            System.out.println("Asynchronous task is running with: " + Thread.currentThread().getName());
            Thread.sleep(1000); // Simulate computation
            return 42;  // Return result
        };
        Future<Integer> future = executor.submit(task);
        System.out.println("Future done? " + future.isDone());
        System.out.println("Result: " + future.get());  // Get the result
        System.out.println("Future done? " + future.isDone());

        executor.execute(() -> System.out.println("Asynchronous task is running with: " + Thread.currentThread().getName()));
        // Runnable task
        executor.execute(() -> System.out.println("I'm a Runnable task."));
        // Callable task
        Future<Integer> futureTask = executor.submit(() -> {
            System.out.println("I'm a Callable task.");
            return 1 + 1;
        });
        try {
            // Get the result from the future
            Integer result = futureTask.get(5, TimeUnit.SECONDS);
            System.out.println("Get future result: " + result);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executor.shutdown();
        }
        System.out.println("Done");
        executor.shutdown();  // Shutdown the executor
    }
}

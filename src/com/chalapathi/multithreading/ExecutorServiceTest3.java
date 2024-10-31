package com.chalapathi.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceTest3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        List<Callable<Integer>> tasks = Arrays.asList(
                () -> {
                    System.out.println("Task 1 is running with "+Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("Task 1 is finished with "+Thread.currentThread().getName());
                    return 1;
                },
                () -> {
                    System.out.println("Task 2 is running with "+Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("Task 2 is finished with "+Thread.currentThread().getName());
                    return 2;
                },
                () -> {
                    System.out.println("Task 3 is running with "+Thread.currentThread().getName());
                    Thread.sleep(3000);
                    System.out.println("Task 3 is finished with "+Thread.currentThread().getName());
                    return 3;
                }
        );

        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);
            int sum = results.stream().mapToInt(future -> {
                try {
                    return future.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            }).sum();
            System.out.println("Sum: " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
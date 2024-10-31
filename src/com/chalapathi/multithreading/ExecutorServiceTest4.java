package com.chalapathi.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceTest4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                () -> { Thread.sleep(4000); return "Task 1"; },
                () -> { Thread.sleep(1000); return "Task 2"; },
                () -> { Thread.sleep(3000); return "Task 3"; }
        );

        try {
            String result = executor.invokeAny(tasks);
            System.out.println("First completed task result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

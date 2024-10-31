package com.chalapathi.multithreading;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Hello from a Callable!";
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> future = executor.submit(new CallableExample());
        executor.invokeAll(List.of(new CallableExample(), new CallableExample()));

        try {
            System.out.println(future.get()); // Get the result from the callable
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

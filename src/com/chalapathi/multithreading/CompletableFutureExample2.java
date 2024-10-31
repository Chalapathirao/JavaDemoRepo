package com.chalapathi.multithreading;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample2 {
    public static void main(String[] args) {
        // Create an ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a CompletableFuture
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000); // Simulate a time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello from CompletableFuture!";
        }, executor);

        // Attach a callback to process the result
        future.thenAccept(result -> System.out.println(result)); // Non-blocking callback

        // Shutdown the executor
        executor.shutdown();
    }
}

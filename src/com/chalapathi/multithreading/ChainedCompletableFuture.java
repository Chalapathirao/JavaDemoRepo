package com.chalapathi.multithreading;



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChainedCompletableFuture {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // First task
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42; // Some computation result
        }, executor);

        // Chaining another task that processes the result
        future.thenApply(result -> result * 2) // Process the result
                .thenAccept(finalResult -> System.out.println("Final Result: " + finalResult)); // Output the final result
        executor.shutdown();
    }
}

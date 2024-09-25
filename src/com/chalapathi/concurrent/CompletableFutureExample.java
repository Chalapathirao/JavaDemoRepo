package com.chalapathi.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {
        // Creating a simple CompletableFuture and completing it manually
        CompletableFuture<String> future = new CompletableFuture<>();

        // Simulate async task completion
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000); // Simulate some work
                future.complete("Hello, World!"); // Complete the future
            } catch (InterruptedException e) {
                future.completeExceptionally(e); // Handle exception
            }
        }).start();
        System.out.println(Thread.currentThread().getName());
        // Now we can use the result
        future.thenAccept(result -> System.out.println("Result: " + result));

        // If there's an exception
        future.exceptionally(ex -> {
            System.out.println("Something went wrong: " + ex.getMessage());
            return null;
        });
    }
}

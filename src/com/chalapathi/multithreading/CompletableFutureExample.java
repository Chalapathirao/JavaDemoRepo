package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Task is running asynchronously in thread: " + Thread.currentThread().getName());
        });
        future.join();  // Waits for the task to complete
    }
}


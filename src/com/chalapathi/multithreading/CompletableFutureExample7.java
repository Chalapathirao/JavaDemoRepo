package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample7 {
    public static void main(String[] args) {
        CompletableFuture<String> future = new CompletableFuture<>();

        // Completing the future in a separate thread
        new Thread(() -> {
            try {
                Thread.sleep(1000);  // Simulate some delay
                future.complete("Manual completion!");
            } catch (InterruptedException e) {
                future.completeExceptionally(e);
            }
        }).start();

        System.out.println("Result: " + future.join());  // "Manual completion!"
    }
}


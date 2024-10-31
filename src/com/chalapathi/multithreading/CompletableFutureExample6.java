package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample6 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            if (Math.random() > 0.5) {
                throw new RuntimeException("Something went wrong!");
            }
            return 42;
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return -1; // Default value on exception
        });

        System.out.println("Result: " + future.join());
    }
}


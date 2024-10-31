package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample8 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000); // Simulate long task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Task result";
        }).completeOnTimeout("Default Result", 1, TimeUnit.SECONDS);

        System.out.println("Result: " + future.join());  // "Default Result" if task exceeds 1 second
    }
}


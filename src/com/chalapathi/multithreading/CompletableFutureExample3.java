package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample3 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return "Hello,";
        }).thenApplyAsync(result -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return result + " World!";
        }).thenAccept(finalResult -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println("Final Result: " + finalResult);  // "Hello, World!"
        });
    }
}


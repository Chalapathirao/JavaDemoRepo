package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample1 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println("Running in ForkJoin common pool: " + Thread.currentThread().getName()));
        future.join();
    }
}

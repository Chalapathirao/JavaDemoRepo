package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample4 {
    public static void main(String[] args) {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

//        CompletableFuture<Integer> result = future1.thenCombine(future2, (num1, num2) -> num1 + num2);
        CompletableFuture<Integer> result = future1.thenCombine(future2, Integer::sum);

        System.out.println("Combined Result: " + result.join());  // 30


        CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApplyAsync(result1 -> {
            return result1 + ", Async World!";
        }).thenAcceptAsync(finalResult -> {
            System.out.println("Final Result: " + finalResult);
        }).join();
    }
}


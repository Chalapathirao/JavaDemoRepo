package com.chalapathi.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class CompletableFutureExample5 {
    public static void main(String[] args) {
        List<CompletableFuture<String>> futures = Arrays.asList(
                CompletableFuture.supplyAsync(() -> "Task 1"),
                CompletableFuture.supplyAsync(() -> "Task 2"),
                CompletableFuture.supplyAsync(() -> "Task 3")
        );

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

        allFutures.join(); // Wait for all to complete

        // Collect results
        List<String> results = futures.stream()
                .map(CompletableFuture::join)
                .toList();

        System.out.println("Results: " + results); // ["Task 1", "Task 2", "Task 3"]
    }
}


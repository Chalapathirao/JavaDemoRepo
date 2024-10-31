package com.chalapathi.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from a Runnable!: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start(); // Start the thread
        System.out.println("Hello from the main thread: "+Thread.currentThread().getName());
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(new RunnableExample());
        executor.submit(new RunnableExample());
        executor.shutdown();
    }
}

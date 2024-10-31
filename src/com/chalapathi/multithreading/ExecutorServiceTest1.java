package com.chalapathi.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);  // Create a pool of 3 threads
//        for (int i = 0; i < 10; i++) {
//            int task = i;
//            Future<?> future = executor.submit(() -> {
//                System.out.println("Task " + task + " is being run by " + Thread.currentThread().getName());
//            });
//        }
//        System.out.println("All tasks submitted: " + Thread.currentThread().getName());

        System.out.println("started thread  : " + Thread.currentThread().getName());
        Callable<String> stringCallable = () -> {
            try {
                Thread.sleep(5000);
                System.out.println("Task 1 is being run by " + Thread.currentThread().getName());
                return "hello";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Future<?> future1 = executor.submit(stringCallable);
        String o = (String) future1.get();
        System.out.println("blocking thread : " + Thread.currentThread().getName()+ "output: "+o);



        executor.shutdown();  // Shutdown the executor
    }
}

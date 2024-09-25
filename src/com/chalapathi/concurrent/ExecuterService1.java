package com.chalapathi.concurrent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecuterService1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        /*executorService.execute(new Runnable() {
            @Override
            public void run() {

                System.out.println("Asynchronous task executed by :"+Thread.currentThread().getName());
            }
        });

        executorService.execute(() ->System.out.println("Asynchronous task executed by :"+Thread.currentThread().getName()));
        executorService.shutdown();*/


        /*ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newScheduledThreadPool(10);

        executorService1.execute(() ->System.out.println("Asynchronous task executed by newSingleThreadExecutor :"+Thread.currentThread().getName()));
        executorService1.execute(() ->System.out.println("second Asynchronous task executed by newSingleThreadExecutor :"+Thread.currentThread().getName()));
        executorService1.shutdown();*/


        Future<?> future1 = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Asynchronous task running using submit");
            }
        });
        System.out.println(future1.get()); //returns null if the task has finished correctly.

        Future<Object> future2 = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        System.out.println(future2.get());

        Set<Callable<String>> callables = new HashSet<Callable<String>>();
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Task 2";
            }
        });

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });
        String result = executorService.invokeAny(callables);
        System.out.println("result = " + result);
        System.out.println();
        List<Future<String>> futures = executorService.invokeAll(callables);
        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }
        executorService.shutdown();
    }
}

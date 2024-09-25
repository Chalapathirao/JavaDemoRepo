package com.chalapathi.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class WhyNotFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = service.submit(() -> {
            //your doing api call
            System.out.println("Thread : "+Thread.currentThread().getName());
          // delay(1);
          //  Thread.sleep(5000);
         //   System.out.println(10/0); //no exception handing is provided
            return Arrays.asList(2, 5, 7, 3, 9, 0, 8, -1, 13, 4);
        });
        System.out.println(future.get());

        Future<List<Integer>> future1 = service.submit(() -> {
            System.out.println("Thread : "+Thread.currentThread().getName());
            //Thread.sleep(5000);
            return Arrays.asList(5,7,6,3);
        });
        Future<List<Integer>> future2 = service.submit(() -> {
            System.out.println("Thread : "+Thread.currentThread().getName());
           // Thread.sleep(5000);
            return Arrays.asList(8,2,1,6,9);
        });
       // future1.get()+ future2.get(); //not applied
       // future1.feature2

        List<Integer> future1Resp = future1.get();
        List<Integer> future2Resp = future2.get();
        System.out.println(future1Resp+ "" + future2Resp);

        service.shutdown();

        CompletableFuture<String> completableFuture=new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("return some dummy data....."); //if its taking longer time, we can complete it and return dummay data


    }

    private static void delay(int min) {
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

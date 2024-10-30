package com.chalapathi.multithreading;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest3 {

    private static BlockingQueue<Integer>  queue = new LinkedBlockingQueue<>(10);
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }

    public static class Producer implements Runnable {
        @Override
        public void run() {
            try {
                int i = 0;
                while (true) {
                    queue.put(i++);
                    System.out.println("Producer produced " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    int value = queue.take();
                    System.out.println("Consumer consumed " + value);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

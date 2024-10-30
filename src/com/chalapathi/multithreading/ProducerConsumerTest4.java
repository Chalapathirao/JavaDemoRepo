package com.chalapathi.multithreading;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerTest4 {
    public static void main(String[] args) {
        Data data = new Data(2); // Buffer capacity of 2 items

        Thread producerThread = new Thread(new ProducerP(data), "Producer");
        Thread consumerThread = new Thread(new ConsumerC(data), "Consumer");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Data {
    private final BlockingQueue<String> queue;
    private final int capacity;

    public Data(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayBlockingQueue<>(capacity);
    }

    public void produce(String item) throws InterruptedException {
        queue.put(item); // Blocks if the queue is full
        System.out.println("Produced: " + item);
    }

    public String consume() throws InterruptedException {
        String item = queue.take(); // Blocks if the queue is empty
        System.out.println("Consumed: " + item);
        return item;
    }
}


class ProducerP implements Runnable {
    private final Data data;

    public ProducerP(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // Producing 5 items
                data.produce("Item " + i);
                Thread.sleep(1000); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ConsumerC implements Runnable {
    private final Data data;

    public ConsumerC(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) { // Consuming 5 items
                data.consume();
                Thread.sleep(1500); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

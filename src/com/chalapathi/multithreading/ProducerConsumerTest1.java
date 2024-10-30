package com.chalapathi.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest1 {

    public static void main(String[] args) {
        Object key = new Object();
        Queue<Integer> queue = new LinkedList<>(); // momo plate
        int size = 10;
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    synchronized (key) {
                        try {
                            if (queue.size() == size)
                                key.wait();
                            queue.offer(count++);
                            key.notifyAll();
                            Thread.sleep(1000);
                            System.out.println("MOMO producer, plate size=" + queue.size());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (key) {
                    try {
                        if (queue.isEmpty())//queue.size() == 0
                            key.wait();
                        queue.poll();
                        key.notifyAll();
                        Thread.sleep(1000);
                        System.out.println("MOMO Consumed, Plate size=" + queue.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        producer.start();
        consumer.start();
    }
}

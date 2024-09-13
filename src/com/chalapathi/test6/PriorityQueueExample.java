package com.chalapathi.test6;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue for integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the queue
        pq.add(5);
        pq.add(2);
        pq.add(9);
        pq.add(1);
       // pq.add(null);
        System.out.println("PriorityQueue: " + pq);
//        Iterator<Integer> iterator = pq.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        // Retrieve and print elements
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
        System.out.println(pq.size());

    }
}

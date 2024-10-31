package com.chalapathi.multithreading;



class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public synchronized void lockResource(Resource otherResource) {
        System.out.println("Locked " + name);
        try {
            Thread.sleep(50); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Trying to lock " + otherResource.name);
        otherResource.lockResource(this);  // Attempt to lock other resource
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Resource r1 = new Resource("Resource1");
        Resource r2 = new Resource("Resource2");

        Thread t1 = new Thread(() -> r1.lockResource(r2));
        Thread t2 = new Thread(() -> r2.lockResource(r1));

        t1.start();
        t2.start();
    }
}

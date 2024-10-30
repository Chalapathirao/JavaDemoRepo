package com.chalapathi.multithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // Case 1: Default Priority no setting
        t1.start();
        t2.start();*/


       /* MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        // Setting priority to thread via NORM_PRIORITY
        // which set priority to 5 as default thread
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        // Setting default priority using
        // NORM_PRIORITY
        t1.start();
        t2.start();*/

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();



    }
}

class MyThread extends Thread {

    public void run()
    {
        System.out.println("Running Thread : " + currentThread().getName() + ", Running Thread Priority : " + currentThread().getPriority());
        System.out.println();
    }
}

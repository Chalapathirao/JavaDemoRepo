package com.chalapathi.multithreading;

public class ThreadTest1 {
    public static void main(String[] args) {
        // Creating a thread object of our thread class
        Thread obj1 = new MyThread1();
        Thread obj2 = new MyThread2();
        // Getting the threads to the run state
        // This thread will transcend from runnable to run
        // as start() method will look for run() and execute it
        obj1.setName("Thread~~~~0");
        obj1.start();
        // This thread will also transcend from runnable to
        // run as start() method will look for run() and
        // execute it
        obj2.setName("Thread~~~~1");
        obj2.start();

        //Runnable

        // Creating reference of Runnable to
        // our classes above in main() method
        Runnable obj3 = new MyThread3();
        Runnable obj4 = new MyThread4();

        // Creating reference of thread class
        // by passing object of Runnable in constructor of
        // Thread class
        Thread t4 = new Thread(obj3);
        Thread t5 = new Thread(obj4);

        // Starting the execution of our own run() method
        // in the classes above
        t4.start();
        t5.start();
    }
}

class MyThread1 extends Thread {

    // Method inside MyThread2
    // run() method which is called as
    // soon as thread is started
    public void run() {
        // Print statement when the thread is called
        System.out.println("Thread1 is running: " + Thread.currentThread().getName());
    }
}

// Class 2
// Main thread Class extending main Thread Class
class MyThread2 extends Thread {
    // Method inside MyThread2
    // run() method which is called
    // as soon as thread is started
    public void run() {
        // run() method which is called as soon as thread is
        // started
        // Print statement when the thread is called
        System.out.println("Thread2 is running: " + Thread.currentThread().getName());
    }
}

class MyThread3 implements Runnable {

    // run() method inside this class
    public void run() {
        // Iterating to get more execution of threads
        for (int i = 0; i < 5; i++) {

            // Print statement whenever run() method
            // of this class is called
            System.out.println("Thread3: "+Thread.currentThread().getName());

            // Getting sleep method in try block to
            // check for any exceptions
            try {
                // Making the thread pause for a certain
                // time using sleep() method
                Thread.sleep(1000);
            }

            // Catch block to handle the exceptions
            catch (Exception _) {
            }
        }
    }
}

class MyThread4 implements Runnable {
    // run() method inside this class
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print statement whenever run() method
            // of this class is called
            System.out.println("Thread4: "+Thread.currentThread().getName());
            // Getting sleep method in try block to
            // check for any exceptions
            try {
                // Making the thread pause for a certain
                // time
                // using sleep() method
                Thread.sleep(1000);
            }
            // Catch block to handle the exceptions
            catch (Exception _) {
            }
        }
    }
}

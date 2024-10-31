package com.chalapathi.multithreading;



class Message {
    private String message;
    private boolean hasMessage = false;

    public synchronized void writeMessage(String msg) throws InterruptedException {
        while (hasMessage) {
            wait();
        }
        message = msg;
        hasMessage = true;
        notify();
    }

    public synchronized String readMessage() throws InterruptedException {
        while (!hasMessage) {
            wait();
        }
        hasMessage = false;
        notify();
        return message;
    }
}

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message message = new Message();

        Thread writer = new Thread(() -> {
            try {
                System.out.println("Writer is writing a message");
                message.writeMessage("Hello from Writer!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread reader = new Thread(() -> {
            try {
                System.out.println("Reader is waiting for message");
                System.out.println("Reader got message: " + message.readMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writer.start();
        reader.start();
    }
}


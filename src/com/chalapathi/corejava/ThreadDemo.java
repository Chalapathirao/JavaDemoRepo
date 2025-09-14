package com.chalapathi.corejava;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		Thread th = new Thread(new ThreadDemo());
		th.start();

		Thread th1 = new Thread(new Multi3());
		th1.setDaemon(true);
		th1.start();
		
		// ThreadDemo tDemo= new ThreadDemo();
//		Thread t = new ThreadDemo();
//		t.setName("one");
//		t.start();
//		
//		Multi3 m1=new Multi3();  
//		Thread t1 =new Thread(m1);  
//		t1.start();
//		
//		
//		Thread thread1 = new Thread(() ->
//		 System.out.println("Hello World from Runnable!"));
//		thread1.start();

//		Thread thread2 = new Thread() {
//		    @Override
//		    public void run() {
//		        System.out.println("Hello World from subclass!");
//		    }
//		};
//		thread2.start();
	}

	@Override
	public void run() {
		System.out.println("thread is running...");
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

}

class Multi3 implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running... with runnable");
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}
}

package com.demo.threads;

class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Child Thread Started");
			Thread.sleep(5000);
			int a = 100 / 0;
			System.out.println("Child Thread completed");
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}
	}
}

public class ThreadDemo extends Thread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread started");
		MyRunnable1 runnable = new MyRunnable1();
		Thread thread = new Thread(runnable);
		thread.start();
		thread.join();
		System.out.println("Main Thread completed");

	}

}



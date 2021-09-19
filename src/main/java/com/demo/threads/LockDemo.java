package com.demo.threads;

public class LockDemo {

	public static void main(String[] args) {

		Runnable runnable = new ConcurrencyLock();
		Thread thread1 = new Thread(runnable);
		thread1.start();

		Thread thread2 = new Thread(runnable);
		thread2.start();

	}

}

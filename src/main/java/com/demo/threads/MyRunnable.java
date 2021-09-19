package com.demo.threads;

public class MyRunnable implements Runnable {
	
	UtilityDemo utilityDemo = new UtilityDemo();

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " - run() started");
		utilityDemo.print();
		System.out.println(Thread.currentThread() + " - run() completed");
	}

}

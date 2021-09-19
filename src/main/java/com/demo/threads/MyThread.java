package com.demo.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

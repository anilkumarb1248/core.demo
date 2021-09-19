package com.demo.threads;

public class UtilityDemo {

	public void print() {
		System.out.println(Thread.currentThread() + " - execution started");
		
		synchronized (this) {
			int i = 1;
			System.out.println("Printing Started: ");
			while (i <= 10) {
				System.out.println((i++) + " by " + Thread.currentThread());
			}
		}
		System.out.println(Thread.currentThread() + " - execution completed");

	}

}







package com.demo.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name + " ...job started by Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		System.out.println(name + " ...job completed by Thread: " + Thread.currentThread().getName());
	}
}

public class ExecutorDemo {
	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Anil"), new PrintJob("Uday"), new PrintJob("Kumar"), new PrintJob("Raju"),
				new PrintJob("Kiran"), new PrintJob("Sandeep") };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}

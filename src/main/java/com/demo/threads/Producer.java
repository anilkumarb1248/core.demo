package com.demo.threads;

public class Producer implements Runnable {

	@Override
	public void run() {

		System.out.println("Producer run() method started");

		synchronized (this) {

			try {
				System.out.println("Producer code started");
				Thread.sleep(5000);
				System.out.println("Producer code ended");
				System.out.println("Producer notifying to waiting threads");
				this.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

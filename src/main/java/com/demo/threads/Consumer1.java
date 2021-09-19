package com.demo.threads;

public class Consumer1 implements Runnable {

	private Runnable producer;

	public Consumer1(Runnable producerThread) {
		this.producer = producerThread;
	}

	@Override
	public void run() {
		System.out.println("Consumer1 run() method started");

		synchronized (producer) {
			try {

				System.out.println("Consumer1 waiting started");
				producer.wait();
				System.out.println("Consumer1 - Got notification from producer");
				System.out.println("Consumer1 code ended");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

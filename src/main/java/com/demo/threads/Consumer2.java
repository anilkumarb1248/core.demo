package com.demo.threads;

public class Consumer2 implements Runnable {

	private Runnable producer;

	public Consumer2(Runnable producerThread) {
		this.producer = producerThread;
	}

	@Override
	public void run() {
		System.out.println("Consumer2 run() method started");

		synchronized (producer) {
			try {

				System.out.println("Consumer2 waiting started");
				producer.wait();
				System.out.println("Consumer2 - Got notification from producer");
				System.out.println("Consumer2 code ended");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

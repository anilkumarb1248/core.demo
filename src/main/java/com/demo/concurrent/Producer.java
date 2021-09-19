package com.demo.concurrent;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("The Producer started adding the elements");
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Adding the element: " + i);
				queue.put(i);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			queue.put(11); // Specifying the consumer thread to stop
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The Producer stopped adding the elements");

	}

}

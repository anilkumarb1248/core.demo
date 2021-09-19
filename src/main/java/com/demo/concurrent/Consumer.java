package com.demo.concurrent;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("The Consumer started fetching the elements");
		try {
			Integer i;
			while ((i = queue.take()) <= 10) {
				System.out.println("         Retrieved the element: " + i);
				Thread.sleep(10000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The Consumer stopped fetching the elements");

	}

}

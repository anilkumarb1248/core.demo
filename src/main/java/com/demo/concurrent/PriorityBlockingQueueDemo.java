package com.demo.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

		Runnable producer = () -> {
			System.out.println("The Producer started adding the elements");
			try {
				for (int i = 1; i <= 100; i++) {
					System.out.println("Adding the element: " + i);
					queue.put(i);
					if (i % 2 == 0)
						Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The Producer stopped adding the elements");

		};

		Runnable consumer = () -> {
			System.out.println("The Consumer started fetching the elements");
			try {
				Integer i;
				while ((i = queue.take()) <= 99) {
					System.out.println("         Retrieved the element: " + i);
					Thread.sleep(1000);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The Consumer stopped fetching the elements");

		};

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}
}

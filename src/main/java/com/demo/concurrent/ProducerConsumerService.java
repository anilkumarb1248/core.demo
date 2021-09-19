package com.demo.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) {

		BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(3);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();

	}

}



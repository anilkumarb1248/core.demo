package com.demo.conccurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicTest {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		ExecutorService executorService = null;

		try {
			executorService = Executors.newFixedThreadPool(2);

			Runnable task1 = () -> {
				for (int i = 1; i <= 20000; i++) {
					counter.increament();
				}
			};

			Runnable task2 = () -> {
				for (int i = 1; i <= 80000; i++) {
					counter.increament();
				}
			};

			executorService.submit(task1);
			executorService.submit(task2);
			executorService.awaitTermination(1, TimeUnit.SECONDS);

			System.out.println("Final counter value: " + counter.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != executorService) {
				executorService.shutdown();
			}
		}

	}

}

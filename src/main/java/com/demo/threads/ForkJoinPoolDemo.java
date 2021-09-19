package com.demo.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class ForkJoinPoolDemo {

	public static void main(String[] args) {

		int sumofFirst = 100;
		long[] numbers = LongStream.rangeClosed(1, sumofFirst).toArray();
		// System.out.println(Arrays.toString(numbers)); // 1 - 100

		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		System.out.println("Processors available: " + Runtime.getRuntime().availableProcessors()); // 4

		ForkJoinAddTask forkJoinAddTask = new ForkJoinAddTask(numbers);
		long sum = forkJoinPool.invoke(forkJoinAddTask);
		System.out.println("Sum of given numbers: " + sum); // 5050
	}

}

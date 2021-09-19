package com.demo.threads;

import java.util.concurrent.RecursiveTask;

public class ForkJoinAddTask extends RecursiveTask<Long> {

	private static final long serialVersionUID = 1L;

	private final long[] numbers;
	private final int start;
	private final int end;

	public static final long THRESHOLD = 5;

	public ForkJoinAddTask(long[] numbers) {
		this(numbers, 0, numbers.length);
	}

	private ForkJoinAddTask(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		int length = end - start;
		if (length <= THRESHOLD) {
			return add(numbers);
		} else {
			ForkJoinAddTask firstTask = new ForkJoinAddTask(numbers, start, start + length / 2);
			firstTask.fork();
			ForkJoinAddTask secondTask = new ForkJoinAddTask(numbers, start + length / 2, end);
			Long secondTaskResult = secondTask.compute();
			Long firstTaskResult = firstTask.join();
			return firstTaskResult + secondTaskResult;
		}
	}

	private Long add(long[] numbers) {
		long result = 0;
		for (int i = start; i < end; i++) {
			result += numbers[i];
		}
		return result;
	}
}

package com.demo.threads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecuterServiceDemo {

	public static void main(String[] args) {

		List<PrinterTask> taskList = Arrays.asList(new PrinterTask("Task1"), new PrinterTask("Task2"),
				new PrinterTask("Task3"), new PrinterTask("Task4"), new PrinterTask("Task5"), new PrinterTask("Task6"));

//		ExecutorService service = Executors.newSingleThreadExecutor();
//		ExecutorService service = Executors.newFixedThreadPool(3);
//		ExecutorService service = Executors.newCachedThreadPool();

		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		for (PrinterTask task : taskList) {
//			service.submit(task);
			service.schedule(task, 10, TimeUnit.SECONDS);
		}

		service.shutdown();

	}

}



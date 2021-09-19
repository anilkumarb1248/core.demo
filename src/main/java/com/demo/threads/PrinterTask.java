package com.demo.threads;

public class PrinterTask implements Runnable {

	private String taskName;

	public PrinterTask(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		System.out.println(taskName + " printing started by: " + threadName);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("    " + taskName + " printing started by: " + threadName);

	}
}

package com.demo.threads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLock implements Runnable {

	private ReentrantLock lock;

	public ConcurrencyLock() {
		lock = new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				String threadName = Thread.currentThread().getName();

				System.out.println("Acquired the lock by: " + threadName);
				System.out.println("Working.... by: " + threadName);
//				Thread.sleep(15000);// Line 1
				System.out.println("Completed by: " + threadName);
			} else {
				System.out.println("Alternative way working... by: " + Thread.currentThread().getName());
			}
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}

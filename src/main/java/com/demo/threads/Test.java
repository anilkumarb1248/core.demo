package com.demo.threads;

class Task implements Runnable {

	@Override
	public void run() {
		Test test = new Test();
		test.print(1);
	}
}

public class Test {

	public void print(int count) {
		System.out.println("Entered Thread: " + Thread.currentThread().getName() + "Count: " + count);

		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + " by " + Thread.currentThread().getName());
				if (i == 3 && count != 3)
					print(count + 1);
			}
		}
		System.out.println("Completed Thread: " + Thread.currentThread().getName() + "Count: " + count);

	}

	public static void main(String[] args) {
		Thread t = new Thread(new Task());
		t.setName("Task-Thread");
		t.start();

	}

}

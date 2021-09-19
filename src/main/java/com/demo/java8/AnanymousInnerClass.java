package com.demo.java8;

public class AnanymousInnerClass {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};

		Runnable runnable1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Lambda expression: " + i);
			}
		};

		Thread t = new Thread(runnable1);
		t.start();

	}

}

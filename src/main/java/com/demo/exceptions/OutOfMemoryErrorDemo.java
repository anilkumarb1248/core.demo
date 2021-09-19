package com.demo.exceptions;

public class OutOfMemoryErrorDemo {

	public void createArray(int size) {
		try {
			Integer[] array = new Integer[size];
		} catch (OutOfMemoryError e) {
			System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
			System.err.println("Array size too large: " + size);
		}
	}

	public static void main(String[] args) {
		OutOfMemoryErrorDemo demo = new OutOfMemoryErrorDemo();
		System.out.println("Before creating large array");
		demo.createArray(1000 * 1000 * 1000);
		System.out.println("After creating large array");
		demo.m1();
	}

	public void m1() {
		System.out.println("I can continue to work");
	}

}

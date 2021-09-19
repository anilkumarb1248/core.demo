package com.demo.exceptions;

class MyResource implements AutoCloseable {
	@Override
//	public void close() throws Exception {
	public void close() {
		System.out.println("MyResource.close() method called");
	}
}

public class FinallyBlockTest {

	public static void main(String[] args) {
		FinallyBlockTest test = new FinallyBlockTest();
		System.out.println("Before method calling");
		test.m1();
		System.out.println("After method calling");
	}

	public void m1() {
		try (MyResource rs = new MyResource()) {
			System.out.println("With in the try block");
			int a = 10/0;
		}
		System.out.println("After the try block");
	}
}

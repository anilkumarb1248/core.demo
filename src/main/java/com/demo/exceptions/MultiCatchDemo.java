package com.demo.exceptions;

public class MultiCatchDemo {

	public static void main(String[] args) {
		try {
			System.out.println(20 / 0);
		} catch (ArithmeticException e) {
			throw new NullPointerException("Some message");
		}
	}
}

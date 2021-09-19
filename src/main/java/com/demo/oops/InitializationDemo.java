package com.demo.oops;

public class InitializationDemo {

	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}

	static String m = m1("1");

	{
		String m = m1("2");
	}

	static {
		String m = m1("3");
	}

	public static void main(String[] args) {
		InitializationDemo o = new InitializationDemo();
	}
}

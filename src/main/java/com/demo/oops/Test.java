package com.demo.oops;

class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getSingletonInstance() {
		if (null == singleton)
			singleton = new Singleton();
		return singleton;
	}
}

public class Test {
	public static void main(String[] args) {
		Singleton instance = Singleton.getSingletonInstance();
		System.out.println(instance.getClass()); // class com.demo.oops.Singleton
	}
}

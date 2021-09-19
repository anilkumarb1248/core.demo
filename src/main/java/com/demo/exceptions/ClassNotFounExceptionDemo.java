package com.demo.exceptions;

import java.lang.Thread.UncaughtExceptionHandler;

//class Dummy {

//}

public class ClassNotFounExceptionDemo {
	public static void main(String[] args) {
//		try {
//			Dummy dummy = new Dummy();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		Class<?> clazz = Class.forName("com.demo.exceptions.Dummy");
//		
//		try {
//
//			Class<?> clazz = Class.forName("com.demo.exceptions.Dummy");
//			// Here we have to provide with package name also
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}

	public void m1() {
		Thread.setDefaultUncaughtExceptionHandler((thread, thr) -> {
			System.out.println("My Default excepiton handler");
			thr.printStackTrace();
		});

		try {
			System.out.println("try-block");
			int a = 9 / 0;
		} finally {
			System.out.println("finally-block");
		}

	}
}



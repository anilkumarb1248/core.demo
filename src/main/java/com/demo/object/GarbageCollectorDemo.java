package com.demo.object;

public class GarbageCollectorDemo {

	public static void createTest() {
		Test t = new Test("Method Ends");
	}

	public static void main(String[] args) throws InterruptedException {

		
		//1.	By nullifying the reference variable
		Test t1 = new Test("Nullifying");
		t1 = null;
		
		//2.	By reassigning a reference variable to another object
		Test t2 = new Test("Reassigning ");
		t2 = new Test("Reassigning to something");
		
		//3.	By annonymous object
		new Test("Ananymous Object");
		
		//4.	Object created inside a method
		GarbageCollectorDemo.createTest();
		
		//5.	Island of Isolation
		Test test1 = new Test("Island of Isolation 1");
		Test test2 = new Test("Island of Isolation 2");
		test1.t = test2;
		test2.t = test1;
		test1 = null;
		test2 = null;
		
		System.gc();
		Runtime.getRuntime().gc();
		Thread.sleep(10000);
		System.out.println("GarbageCollectorDemo Ends");
	}

}

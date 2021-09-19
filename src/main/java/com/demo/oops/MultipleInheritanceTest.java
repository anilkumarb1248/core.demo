package com.demo.oops;

class A {
	public void m1() {
		try {
			System.out.println("Hello");
		} catch (Exception e) {

		}
	}
}

public class MultipleInheritanceTest {
	public static void main(String[] args) {
		new A().m1();
		System.out.println("Test-main()");

	}

}

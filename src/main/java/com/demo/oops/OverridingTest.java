package com.demo.oops;

class Parent {
	public void m1() {
		System.out.println("Parent m1() method");
	}
}

class Child extends Parent {
	public void m1() {
		System.out.println("Child m1() method");
	}
}

public class OverridingTest {

	public static void main(String[] args) {

		Parent parent = new Parent();
		parent.m1();
		
		Child child = new Child();
		child.m1();
		
		Parent parent2 = new Child();
		parent2.m1();
	}

}

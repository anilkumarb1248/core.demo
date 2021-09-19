package com.demo.object;

class Parent {
	String parentProperty = "Parent";
}

class Child implements Cloneable {
	String childProperty = "Child";
	Parent parent = new Parent();

	@Override
	protected Child clone() throws CloneNotSupportedException {
		return (Child) super.clone();
	}

	@Override
	public String toString() {
		return "Child [childProperty=" + childProperty + "parentProperty=" + parent.parentProperty + "]";
	}

}

public class ObjectDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Child child = new Child();
		Child clonedChild = child.clone();

		System.out.println(child);
		System.out.println(clonedChild);
	}

}

package com.demo.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {

	private static final long serialVersionUID = 6585326216914417886L;

	private String aData = "A Data";
	B b;

	public A(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [aData=" + aData + ", b=" + b + "]";
	}

}

class B {

	private static final long serialVersionUID = -6962584613363079734L;
	private String bData = "B Data";

	@Override
	public String toString() {
		return "B [bData=" + bData + "]";
	}

}

class Parent {
//	private static final long serialVersionUID = -76687L;
	protected String parentData;

//	public Parent() {
//	}

	public Parent(String parentData) {
		this.parentData = parentData;
	}

	@Override
	public String toString() {
		return "Parent [parentData=" + parentData + "]";
	}
}

class Child extends Parent implements Serializable {

	private static final long serialVersionUID = -554L;
	private String childData;

	public Child(String childData, String parentData) {
		super(parentData);
		this.childData = childData;
	}

	@Override
	public String toString() {
		return "Child [childData=" + childData + ", parentData=" + parentData + "]";
	}

}

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		serialize();
		deSerialize();
	}

	private static void serialize() throws IOException {

		Child child = new Child("abc", "efg");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(child);
		oos.close();
		fos.close();
		System.out.println("Serialization is completed");
	}

	private static void deSerialize() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child c = (Child) ois.readObject();
		System.out.println(c);
		ois.close();
		fis.close();
		System.out.println("deSerialization is completed");
	}
}

package com.demo.designpatterns.singleton;

import java.io.Serializable;

public class SingletonObject implements Cloneable, Serializable {

	private static SingletonObject singletonObject = null;

	// Making the constructor as private. So, that the class can not be instantiated
	private SingletonObject() {

	}

	// Creating the object when first requested
	public static SingletonObject getInstance() {
		if (null == singletonObject) {
			singletonObject = new SingletonObject();
		}
		return singletonObject;
	}

	public void doSomeWork() {
		System.out.println("Doing work...");
	}

	@Override
	protected SingletonObject clone() throws CloneNotSupportedException {
		return (SingletonObject) super.clone();
	}

}

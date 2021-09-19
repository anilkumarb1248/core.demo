package com.demo.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.serialization.Employee;

public class SingletonTest {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

//		SingletonObject singletonObject = new SingletonObject();
		// CE: The constructor SingletonObject() is not visible

		SingletonObject singletonObject = SingletonObject.getInstance();
		singletonObject.doSomeWork();

//		SingletonObject singletonObject1 = singletonObject.clone();
//		singletonObject1.doSomeWork();
//		System.out.println(singletonObject.hashCode());
//		System.out.println(singletonObject1.hashCode());

		FileOutputStream fos = new FileOutputStream("cloned.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(singletonObject);
		System.out.println("Serialization is completed");

		FileInputStream fis = new FileInputStream("cloned.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonObject deserializedObject = (SingletonObject) ois.readObject();
		deserializedObject.doSomeWork();

		System.out.println(singletonObject.hashCode());
		System.out.println(deserializedObject.hashCode());
	}

}

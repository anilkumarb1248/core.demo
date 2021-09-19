package com.demo.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		serialize();
		deSerialize();
	}

	private static void serialize() throws IOException {
		EmpAddress address = new EmpAddress("Hyd", "TG", "123456");
		Employee empployee = new Employee(100, "Anil", 10000);

		FileOutputStream fos = new FileOutputStream("emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(empployee);
		oos.close();
		fos.close();
		System.out.println("Serialization is completed");
	}

	private static void deSerialize() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee storedEmp = (Employee) ois.readObject();
		System.out.println(storedEmp);
		ois.close();
		fis.close();
		System.out.println("deSerialization is completed");
	}

}

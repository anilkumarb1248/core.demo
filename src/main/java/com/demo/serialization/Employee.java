package com.demo.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmpAddress implements Serializable {

private static final long serialVersionUID = -2078196257925882178L;
//private static final long serialVersionUID = 1L;
	

	private String city;
	private String state;
	private String zipcode;

	public EmpAddress(String city, String state, String zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "EmpAddress [city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}

}

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
//	private double salary;
//	private String role;
//	private EmpAddress address;
	

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
//		this.salary = salary;
	}
	
	void writeObject(ObjectOutputStream os) {
		System.out.println("Serialization");
	}
	
	void readObject(ObjectInputStream is) {
		System.out.println("DeSerialization");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

package com.demo.java8.collectors;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 1048238722542254307L;

	private Integer id;
	private String name;
	private Double salary;
	private String role;
	private String unit;
	private LocalDate dob;

	public Employee() {
	}

	public Employee(int id, String name, double salary, String role, String unit, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.unit = unit;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + ", unit=" + unit
				+ ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.id.compareTo(emp.id);
	}

}

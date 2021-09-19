package com.demo.java8.collectors;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class JoiningDemo {

//	private List<Employee> employees = null;
//
//	public JoiningDemo() {
//		employees = EmployeeData.getEmployeesData();
//	}

	public static void main(String[] args) {
		new JoiningDemo().joinNames();
	}

public void joinNames() {
	List<Employee> employees = EmployeeData.getEmployeesData();
	String joiner = employees.stream().map(Employee::getName).collect(Collectors.joining("-"));
	System.out.println(joiner);
	// AAA-BBB-CCC-DDD-EEE-FFF-GGG-HHH-III-JJJ-KKK
}

}

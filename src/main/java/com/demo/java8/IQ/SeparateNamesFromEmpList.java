package com.demo.java8.IQ;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class SeparateNamesFromEmpList {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();
		//List<String> employeeNames = employees.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(employeeNames);
	}

}

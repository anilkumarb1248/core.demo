package com.demo.java8.IQ;

import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class FindSumOfEmployeeSalaries {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();
		Double sum1 = employees.stream().mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println(sum1);

		Double sum2 = employees.stream().map(Employee::getSalary).collect(Collectors.summingDouble(ele -> ele));
		System.out.println(sum2);
	}

}

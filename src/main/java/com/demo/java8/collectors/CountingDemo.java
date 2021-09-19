package com.demo.java8.collectors;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class CountingDemo {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();
		// Find count without Collectors.counting() method
		Long count = employees.stream().filter(emp -> emp.getSalary() < 50000).count();
		System.out.println(count); // 4

		// Find the count of employees whose salary is less than 50000
		Long count1 = employees.stream().filter(emp -> emp.getSalary() < 50000).collect(Collectors.counting());
		System.out.println(count1); // 4

		// Find the count of employees who are Leads
		Long count2 = employees.stream().filter(emp -> emp.getRole().equals("LEAD")).collect(Collectors.counting());
		System.out.println(count2); // 2

		// Find the count of employees who are working for Apple
		Long count3 = employees.stream().filter(emp -> emp.getUnit().equalsIgnoreCase("Apple"))
				.collect(Collectors.counting());
		System.out.println(count3);

		// Find the count of employees whose age is 40 plus
		Long count4 = employees.stream().filter(emp -> {
			LocalDate empDob = emp.getDob();
			int age = Period.between(empDob, LocalDate.now()).getYears();
			return age >= 40;
		}).peek(emp -> {
			System.out.println(emp.getName()); // JJJ, KKK
		}).collect(Collectors.counting());
		System.out.println(count4); // 2
	}
}

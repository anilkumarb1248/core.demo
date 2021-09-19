package com.demo.java8.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class MaxMinDemo {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();

		Comparator<Employee> comparator = (e1, e2) -> {
			Double s1 = e1.getSalary();
			Double s2 = e2.getSalary();
			return s1.compareTo(s2);
		};
// Find highest salary employee
// Without Collectors
		Optional<Employee> highSalaryEmp = employees.stream().max(comparator);
		System.out.println(highSalaryEmp.get().getName()); // KKK

// With Collectors
		Optional<Employee> highSalaryEmp1 = employees.stream().collect(Collectors.maxBy(comparator));
		System.out.println(highSalaryEmp1.get().getName()); // KKK

// Find lowest salary employee
		Optional<Employee> lowSalaryEmp = employees.stream().collect(Collectors.minBy(comparator));
		System.out.println(lowSalaryEmp.get().getName()); // AAA

// **Find highest salary
		Optional<Double> highSalary = employees.stream().map(Employee::getSalary)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(highSalary.get()); // 200000.0

// **Find lowest salary
		Optional<Double> lowSalary = employees.stream().map(Employee::getSalary)
				.collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println(lowSalary.get()); // 10000.0

// *** Find second highest salary employee
		Optional<Employee> secondHighest = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(secondHighest.get().getName()); // JJJ

// *** Find second lowest salary employee
		Optional<Employee> secondLowest = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.skip(1).findFirst();
		System.out.println(secondLowest.get().getName()); // BBB
	}

}

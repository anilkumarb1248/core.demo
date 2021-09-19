package com.demo.java8.IQ;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class SortEmployeesByNameAndAge {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();
		//sortingByName(employees);
		sortingByAge(employees);
		// sortingByNameAndAge(employees);

	}

	public static void sortingByName(List<Employee> employees) {
		Comparator<Employee> comparator = (emp1, emp2) -> {
			return emp1.getName().compareTo(emp2.getName());
		};
		List<Employee> sorted = employees.stream().sorted(comparator.reversed()).collect(Collectors.toList());
		//List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println("Sorted Employees by Name in descending order");
		printEmployees(sorted);
	}

	public static void sortingByAge(List<Employee> employees) {
		List<Employee> sorted1 = employees.stream().sorted((emp1, emp2) -> {
			LocalDate date1 = emp1.getDob();
			LocalDate date2 = emp2.getDob();
			return date1.compareTo(date2);
		}).collect(Collectors.toList());
		
		List<Employee> sorted2 = employees.stream().sorted(Comparator.comparing(Employee::getDob)).collect(Collectors.toList());
		printEmployees(sorted2);
	}

	public static void sortingByNameAndAge(List<Employee> employees) {
		List<Employee> sorted = employees.stream().sorted((emp1, emp2) -> {
			if (!emp1.getName().equalsIgnoreCase(emp2.getName())) {
				// if (emp1.getName().compareTo(emp2.getName()) != 0) {
				return emp1.getName().compareTo(emp2.getName());
			} else {
				return emp1.getDob().compareTo(emp2.getDob());
			}
		}).collect(Collectors.toList());
		printEmployees(sorted);
	}

	private static void printEmployees(List<Employee> employees) {
		employees.forEach(emp -> {
			System.out.println(emp);
		});
	}

}

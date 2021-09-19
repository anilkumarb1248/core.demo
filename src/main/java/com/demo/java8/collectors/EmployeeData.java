package com.demo.java8.collectors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

	private static List<Employee> employees = new ArrayList<>();

	private EmployeeData() {
	}

	public static List<Employee> getEmployeesData() {
		return employees;
	}

	static {
		employees.add(new Employee(100, "AAA", 10000, "SE", "APPLE", LocalDate.of(1990, 01, 1)));
		employees.add(new Employee(101, "BBB", 20000, "SE", "BOFA", LocalDate.of(1991, 02, 2)));
		employees.add(new Employee(102, "CCC", 30000, "SSE", "APPLE", LocalDate.of(1992, 03, 3)));
		employees.add(new Employee(103, "DDD", 40000, "SSE", "BOFA", LocalDate.of(1993, 04, 4)));
		employees.add(new Employee(104, "EEE", 50000, "TA", "APPLE", LocalDate.of(1994, 05, 5)));
		employees.add(new Employee(105, "FFF", 60000, "TA", "APPLE", LocalDate.of(1995, 06, 6)));
		employees.add(new Employee(106, "GGG", 70000, "TA", "BOFA", LocalDate.of(1989, 07, 7)));
		employees.add(new Employee(107, "HHH", 80000, "LEAD", "APPLE", LocalDate.of(1985, 8, 8)));
		employees.add(new Employee(108, "III", 90000, "LEAD", "BOFA", LocalDate.of(1987, 9, 9)));
		employees.add(new Employee(109, "JJJ", 100000, "MANAGER", "BOFA", LocalDate.of(1980, 10, 10)));
		employees.add(new Employee(110, "KKK", 200000, "CEO", "APPLE", LocalDate.of(1970, 11, 11)));
	}

}

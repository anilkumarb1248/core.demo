package com.demo.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class GroupingDemo {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();

		// Group the employees by Role
		Map<String, List<Employee>> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getRole));
		map1.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + ": "
					+ entry.getValue().stream().map(Employee::getName).collect(Collectors.joining(",")));
		});
		/***
		 * SE: AAA,BBB SSE: CCC,DDD MANAGER: JJJ CEO: KKK TA: EEE,FFF,GGG LEAD: HHH,III
		 */

		// Count the number of employees in each unit
		Map<String, Long> map2 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getUnit, Collectors.counting()));
		System.out.println(map2); // {APPLE=6, BOFA=5}

		// Compute sum of salaries by unit
		Map<String, Double> map3 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getUnit, Collectors.summingDouble(Employee::getSalary)));
		System.out.println(map3); // {APPLE=430000.0, BOFA=320000.0}

		// Count the number of occurrences of a char in a string
		String s = "AaBBbCdDcEGFefgkDad";
		s = s.toLowerCase();
		// Finding single char count
		long dCount = s.chars().filter(ele -> ele == 'd').count();
		System.out.println(dCount); // 4

		// Find each char count
		Map<Character, Long> map4 = s.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map4);
		// {a=3, b=3, c=2, d=4, e=2, f=2, g=2, k=1}

	}

}

package com.demo.java8.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

	private List<Employee> employees = null;

	public GroupingByDemo() {
		employees = EmployeeData.getEmployeesData();
	}

	public static void main(String[] args) {
		GroupingByDemo demo = new GroupingByDemo();
		demo.groupOnRoles();
	}

	public void groupOnRoles() {
		Map<String, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getRole));
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " -- " + entry.getValue().size());
		});
	}

}

package com.demo.java8.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ToCollectionDemo {

	private List<Employee> employees = null;

	public ToCollectionDemo() {
		employees = EmployeeData.getEmployeesData();
	}

	public static void main(String[] args) {
		ToCollectionDemo demo = new ToCollectionDemo();
		demo.toCollection();
		demo.toList();
		demo.toSet();
		demo.toMap();
	}

	public void toCollection() {

	}

public void toList() {
// Get all the employee names as List
List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
System.out.println(names); // [AAA, BBB, CCC, DDD, EEE, FFF, GGG, HHH, III, JJJ, KKK]

}

	public void toSet() {
// Get all the roles
List<String> rolesList = employees.stream().map(Employee::getRole).collect(Collectors.toList());
System.out.println(rolesList); // [SE, SE, SSE, SSE, TA, TA, TA, LEAD, LEAD, MANAGER, CEO]

Set<String> distinctRoles = employees.stream().map(Employee::getRole).collect(Collectors.toSet());
System.out.println(distinctRoles); // [SE, SSE, MANAGER, CEO, TA, LEAD]

	}

	public void toMap() {
// Convert the list to map with emp id as key and value is employee
Map<Integer, Employee> map = employees.stream().collect(Collectors.toMap(Employee::getId, emp -> emp));
map.entrySet().stream().forEach(System.out::println);
// Convert the list to map with emp id as key and value is name
Map<Integer, String> namesMap = employees.stream()
		.collect(Collectors.toMap(Employee::getId, Employee::getName));
System.out.println(namesMap);
// {100=AAA, 101=BBB, 102=CCC, 103=DDD, 104=EEE, 105=FFF, 106=GGG, 107=HHH,
// 108=III, 109=JJJ, 110=KKK}
	}

}

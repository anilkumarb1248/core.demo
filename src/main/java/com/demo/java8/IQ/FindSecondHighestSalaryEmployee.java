package com.demo.java8.IQ;

import java.util.List;

import com.demo.java8.data.Employee;
import com.demo.java8.data.EmployeeData;

public class FindSecondHighestSalaryEmployee {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployeesData();
Employee seconddHighestEmployee = employees.stream().sorted((emp1,emp2)->{
	double emp1Salary = emp1.getSalary();
	double emp2Salary = emp2.getSalary();
	if(emp1Salary > emp2Salary) {
		return -1;
	}else if(emp1Salary < emp2Salary) {
		return 1;
	}else {
		return 0;
	}

}).skip(1).findFirst().get();
		
		System.out.println(seconddHighestEmployee);

	}

}

package com.demo.simple.programs;

import java.util.Scanner;

public class UserInput {
	
	public int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.next();

		System.out.println("Enter your id:");
		int id = scanner.nextInt();

		System.out.println("User Details name:" + name + ", id: " + id);
		scanner.close();

	}

}

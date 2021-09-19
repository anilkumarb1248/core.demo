package com.demo.simple.programs;

import java.util.Scanner;

public class Addition {

	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your First Number");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter your First Number");
		int secondNumber = scanner.nextInt();

		System.out.println(new Addition().add(firstNumber, secondNumber));

		scanner.close();

	}

}

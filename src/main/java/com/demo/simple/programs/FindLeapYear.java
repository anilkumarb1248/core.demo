package com.demo.simple.programs;

public class FindLeapYear {

	public static void main(String[] args) {

		int year = 1000;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Leap Year");
				} else {
					System.out.println("Non Leap year");
				}

			} else {
				System.out.println("Leap Year");
			}
		} else {
			System.out.println("Non Leap year");
		}

	}

}

package com.demo.simple.programs;

import java.util.Scanner;

public class Test {

	public void findEvenOrOdd() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		scanner.close();
	}

	public void findVowelOrConsonant() {
		char ch = 'a';

//		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println("Vowel");
//		}else {
//			System.out.println("Consonant");
//		}

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}

	}

	public void findLarge() {
		int a = 100;
		int b = 400;
		int c = 300;

		int large = a;
		if (large < b) {
			large = b;
		}
		if (large < c) {
			large = c;
		}

		System.out.println(large);

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.findLarge();
	}

}

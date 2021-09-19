package com.demo.memory_leaks;

import java.util.ArrayList;
import java.util.List;

public class StaticKeyword {

	private static List<Integer> numbers = new ArrayList<>();

	public void populateList() {
		for (int i = 1; i < 100000000; i++) {
			numbers.add(i);
		}
		System.out.println("Debug Point 2");
	}

	public static void main(String arr[]) {
		System.out.println("Debug Point 1");
		new StaticKeyword().populateList();
		System.out.println("Debug Point 3");
	}

}

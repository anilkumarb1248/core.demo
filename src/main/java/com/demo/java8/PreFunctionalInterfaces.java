package com.demo.java8;

import java.util.function.Predicate;

public class PreFunctionalInterfaces {

	public static void main(String[] args) {

		Predicate predicate = new Predicate<String>() {

			@Override
			public boolean test(String s) {
				return s.equals("Anil");
			}

		};
		
		System.out.println(predicate.test("Anil1"));

	}

}

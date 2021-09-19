package com.demo.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelArraySorting {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 60, 40, 80, 42, 64, 16, 6, 61, 76, 93);
		// list.stream().parallel() // or
		List<Integer> list2 = list1.parallelStream().peek(ele -> {
			System.out.println(ele + " is sorting by: " + Thread.currentThread().getName());
		}).sorted().collect(Collectors.toList());

		System.out.println("---------------");

		System.out.println("Before sorting: " + list1);
		System.out.println("After sorting: " + list2);
	}

}

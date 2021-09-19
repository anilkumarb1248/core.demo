package com.demo.java8.IQ;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class FindAvgOfIntegers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Double avg = list.stream().collect(Collectors.averagingInt(ele -> ele));
		System.out.println(avg);
		// (Or)
		IntSummaryStatistics summaryStatistics = list.stream().mapToInt(ele -> ele).summaryStatistics();
		System.out.println(summaryStatistics);
		System.out.println(summaryStatistics.getAverage());

	}

}

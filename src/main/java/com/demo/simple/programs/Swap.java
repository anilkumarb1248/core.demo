package com.demo.simple.programs;

public class Swap {

	public static void main(String[] args) {

		int a = 113;
		int b = 532;
		System.out.println("Before Swapping - a: " + a + ",b: "+ b);
//		Using Temp variable
//		int temp = a;
//		a = b;
//		b = temp;
		
		// without using temp variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping - a: " + a + ",b: "+ b);

	}

}

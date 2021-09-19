package com.demo.arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int n  = 100;
		int sum = n*(n+1) /2;
		System.out.println(sum);

		int[] a = new int[100];
		for(int i=0;i<100;i++) {
			if(i+1 != 55) {
				a[i]= i+1;
			}
		}
		
		
		int arraySum = 0;
		for(int i=0; i<100;i++) {
			arraySum = arraySum+a[i];
		}
		
		System.out.println(arraySum);
		System.out.println(sum-arraySum);

	}

}

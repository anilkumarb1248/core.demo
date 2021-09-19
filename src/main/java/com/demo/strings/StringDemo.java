package com.demo.strings;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("Anil");
		StringBuffer sb = new StringBuffer("Anil1");
		System.out.println(str.contentEquals(sb));
		System.out.println(str.contains("A"));

	}

}



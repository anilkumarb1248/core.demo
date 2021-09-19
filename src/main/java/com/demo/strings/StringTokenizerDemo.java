package com.demo.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
String str = "Welcome&to&Java&Application";
StringTokenizer tokens = new StringTokenizer(str, "&", true);
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}
}

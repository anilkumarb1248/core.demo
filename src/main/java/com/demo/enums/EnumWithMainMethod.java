package com.demo.enums;

public enum EnumWithMainMethod {
	RED, GREEN, BLUE;
	
	public static void main(String arr[]) {
		System.out.println("Enum main method() called");

	}

	public void print() {
		System.out.println("print() from enum");
	}
}

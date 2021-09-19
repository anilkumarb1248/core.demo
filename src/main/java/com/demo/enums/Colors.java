package com.demo.enums;

public enum Colors {
	RED("Red_Color"), GREEN("Green_Color"), BLUE("Blue_Color");

	private String color;

	private Colors(String color) {
		this.color = color;
	}

	public String getValue() {
		return color;
	}
}

package com.demo.object;

public class Test {

	private String type;
	public Test t;

	public Test(String type) {
		this.type = type;
		//System.out.println("Test object created: " + this.place);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Test object destroyed: " + this.type);
		super.finalize();
	}

}

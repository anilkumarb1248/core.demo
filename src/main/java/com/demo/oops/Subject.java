package com.demo.oops;

interface Topic {
	public void understand();
}

class Topic1 implements Topic {

	@Override
	public void understand() {
		System.out.println("Got it");
	}
}

class Topic2 implements Topic {

	@Override
	public void understand() {
		System.out.println("Understand");
	}
}

public class Subject {

	public static void main(String[] args) {
		Subject.startReading(new Topic1());
		Subject.startReading(new Topic2());
	}

	public static void startReading(Topic topic) {
	}

}



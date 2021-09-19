package com.demo.conccurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	AtomicInteger atomicInteger = new AtomicInteger(0);

	public int getValue() {
		return atomicInteger.get();
	}

	public void increament() {
		atomicInteger.getAndIncrement();
	}

}

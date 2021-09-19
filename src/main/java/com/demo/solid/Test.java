package com.demo.solid;

interface Kyeboard {
}

class StandardKeyboard implements Kyeboard {
}

interface Monitor {
}

class StandardMonitor implements Monitor {
}

class WindowsMachine {

	public Kyeboard keyboard;
	public Monitor monitor;

	public WindowsMachine(Kyeboard keyboard, Monitor monitor) {
		this.keyboard = keyboard;
		this.monitor = monitor;
	}
}

public class Test {

	public static void main(String[] args) {

	}

}

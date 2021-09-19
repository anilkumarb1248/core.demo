package com.demo.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {

	public static void main(String[] args) {

		Deque<Integer> stack = new ArrayDeque<>();
		stack.addFirst(10);
		stack.offerFirst(20);
		stack.addFirst(30);
		stack.offerFirst(40);
		stack.addFirst(50);
		stack.offerFirst(60);

		System.out.println(stack); // [60, 50, 40, 30, 20, 10]

		System.out.println(stack.getFirst()); // 60
		stack.removeFirst(); // 60 removed

		System.out.println(stack); // [50, 40, 30, 20, 10]

		stack.offerFirst(70);
		stack.addFirst(80);

		System.out.println(stack); // [80, 70, 50, 40, 30, 20, 10]

		System.out.println(stack.peekFirst()); // 80
		stack.pollFirst(); // removed

		System.out.println(stack); // [70, 50, 40, 30, 20, 10]
	}
}

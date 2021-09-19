package com.demo.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsQueue {
	public static void main(String[] args) {
		Deque<Integer> queue = new ArrayDeque<>();
		queue.addLast(10);
		queue.offerLast(20);
		queue.addLast(30);
		queue.offerLast(40);
		queue.addLast(50);
		queue.offerLast(60);

		System.out.println(queue); // [10, 20, 30, 40, 50, 60]

		System.out.println(queue.getFirst()); // 10
		queue.removeFirst(); // 10 removed
		System.out.println(queue.peekFirst()); // 20
		queue.pollFirst(); // 20 removed

		System.out.println(queue); // [30, 40, 50, 60]
	}
}

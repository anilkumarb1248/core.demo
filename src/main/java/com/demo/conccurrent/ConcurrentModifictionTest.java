package com.demo.conccurrent;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModifictionTest {

	public static void main(String[] args) {

		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add(6);
		}
		System.out.println(list); // [1, 2, 3, 4, 5, 6, 6, 6, 6, 6]
	}

}

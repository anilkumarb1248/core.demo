package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Anil");
		Employee e2 = new Employee(102, "Kumar");

		List list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add("Bandari");
		list.add(100);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj instanceof Employee) {
				Employee emp = (Employee) obj;
				System.out.println(emp);
			}
			if (obj instanceof String) {
				String s = (String) obj;
				System.out.println(s);
			}
			if (obj instanceof Integer) {
				Integer i = (Integer) obj;
				System.out.println(i);
			}
		}

		List<Integer> list1 = new ArrayList<>();
		int i = 10;
		int j = 20;
		list1.add(i); // Autoboxing
		list1.add(j);// Autoboxing
		int p = list1.get(0); // Auto unboxing
		int q = list1.get(1); // Auto unboxing
		System.out.println(p);
		System.out.println(q);

	}
}

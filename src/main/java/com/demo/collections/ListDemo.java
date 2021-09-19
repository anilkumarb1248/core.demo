package com.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Anil");
		list.add("Kumar");
		list.add("Bandari");

		String[] array = new String[3];
		array[0] = "A";
		array[1] = "B";
		array[2] = "C";

		// Converty Array to ArrayList
		List<String> arrayList = Arrays.asList(array);
		arrayList.set(1, "BB");
		// arrayList.add("D"); // UnsupportedOperationException
		//arrayList.remove(2); // UnsupportedOperationException
		System.out.println(arrayList); // [A, BB, C]

		// Convert ArrayList to Array
		String[] listArray = list.toArray(new String[list.size()]);
		listArray[1] = "AAA"; // We can perform the update operation
		for (String s : listArray) {
			System.out.println(s); // Anil AAA Bandari
		}

	}

}

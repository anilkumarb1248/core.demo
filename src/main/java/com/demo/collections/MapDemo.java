package com.demo.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Anil", 100);
		System.out.println(map.put("Anil", 200)); // 100
		System.out.println(map.put("Kumar", 300)); // null
		System.out.println(map); // {Kumar=300, Anil=200}

		Collections.sort(null);

	}

}

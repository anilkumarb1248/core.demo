package com.demo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapArrayListDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Anil", 100);
		map.put("Kumar", 200);
		map.put("Bandari", 300);

//		ArrayList<String> keys = new ArrayList<>(map.keySet());
//		ArrayList<Integer> values = new ArrayList<>(map.values());

//		ArrayList<String> keys = map.keySet().stream().collect(Collectors.toCollection(ArrayList::new));
//		ArrayList<Integer> values = map.values().stream().collect(Collectors.toCollection(ArrayList::new));

		ArrayList<String> keys = (ArrayList) map.keySet().stream().collect(Collectors.toList());
		ArrayList<Integer> values = (ArrayList) map.values().stream().collect(Collectors.toList());

		System.out.println(keys); // [Kumar, Bandari, Anil]
		System.out.println(values); // [200, 300, 100]

//Set<Map.Entry<String, Integer>> set = map.entrySet();
//ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(set);
////ArrayList<Map.Entry<String, Integer>> list = set.stream().collect(Collectors.toCollection(ArrayList::new));
//System.out.println(list); // [Kumar=200, Bandari=300, Anil=100]

	}

}

package com.demo.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MapComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// return s1.compareTo(s2); // Ascending order
		return s2.compareTo(s1); // Descending order
	}

}

public class CollectionsTest {
	public static void main(String[] args) throws InterruptedException {

		Map map = new TreeMap<>(new MapComparator());
		map.put("CCC", 10);
		map.put("DDD", 20);
		map.put("AAA", 30);
		map.put("EEE", 40);
		map.put("BBB", 50);
		System.out.println(map); // {EEE=40, DDD=20, CCC=10, BBB=50, AAA=30}

	}
}

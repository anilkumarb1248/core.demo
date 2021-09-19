package com.demo.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		String s = "hi hello hi bye hii bye hello";
		Map<String, Long> map = Arrays.asList(s.split(" ")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<String, Long> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		
//		String str = "a,b,c\na1,a2,a3\na4,a5,6\nab,NULL,4\nNULL,c,d\nANULL,a,b\na,b,NULL\na,b,NULLB";
//		String[] as = str.split("\n");
//		StringBuilder sb = new StringBuilder();
//		
//		String result = Arrays.stream(as).filter(e->{
//			if(!e.contains("NULL")) {
//				return true;
//			}else {
//				String[] d = e.split(",");
//				boolean found = false;
//				for(String abc: d) {
//					if(abc.equals("NULL")) {
//						found = true;
//						break;
//					}
//						
//				}
//				return !found;
//			}
////			return !e.contains("NULL") && e.contains(",NULL");
//		}).collect(Collectors.joining("/n"));
//		System.out.println(result);
		
		String sb = "CBACD";
		//System.out.println(remove("CBACD"));
//		System.out.println(remove("CABABD"));
		System.out.println(remove("ACBDACBD"));
		
	}
	
	public static String remove(String S) {
		if(S.contains("BA") || S.contains("AB") || S.contains("CD") || S.contains("DC")) {
			String r = S.replace("AB", "").replace("BA", "").replace("CD", "").replace("DC", "");
			System.out.println(r);
			return remove(r);
		}else{
			return S;
		}
	}

}

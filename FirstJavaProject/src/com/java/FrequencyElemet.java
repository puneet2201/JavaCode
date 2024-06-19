package com.java;

import java.util.Arrays;

public class FrequencyElemet {
	public static void main(String[] args) {
		//String str = "helloworld";
		//output ="E";
		
//		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);	
		
		
		String str = "helloworld";
		
		Object[] distinct = Arrays.stream(str.split("")).distinct().toArray();
		System.out.println(Arrays.toString(distinct));
		
	}
}

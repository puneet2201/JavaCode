package com.immutable.pack;

import java.util.Arrays;
import java.util.List;

public class java8Code {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 187, 168, 30);
		list.stream()
		.map(i -> i + " ")
		.filter(i -> i.startsWith("1"))
		.forEach(System.out::println);
	}

}

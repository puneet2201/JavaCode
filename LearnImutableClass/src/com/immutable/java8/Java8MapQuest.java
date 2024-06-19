package com.immutable.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8MapQuest {

	public static void main(String[] args) {
		Map<Integer, Integer> employeeSalaries = new HashMap<>();
		employeeSalaries.put(1, 20000);
		employeeSalaries.put(2, 10000);
		employeeSalaries.put(3, 50000);
		employeeSalaries.put(4, 80000);
		employeeSalaries.put(5, 60000);
		
		Set<Integer> employeeIds = employeeSalaries.entrySet().stream()
                .filter(entry -> entry.getValue() > 50000.0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        // Display the result
        System.out.println("Employee IDs with salary more than 50000:");
        employeeIds.forEach(System.out::println);

		
	}
}

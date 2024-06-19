package com.immutable.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Puneet", 101, "EC", "Male", 32000));
		empList.add(new Employee("Zemin", 131, "CS", "Male", 320000));
		empList.add(new Employee("Snigda", 110, "IT", "Female", 36000));
		empList.add(new Employee("Vipul", 151, "CS", "Male", 3000));
		empList.add(new Employee("Akshat", 191, "EC", "Male", 32400));
		empList.add(new Employee("Garima", 119, "ME", "Female", 1000));
		empList.add(new Employee("Kriti", 200, "EC", "Female", 9000));
		
		//sort the employee based on there gender
		List<Employee> sortEmployeeGender = empList.stream().sorted(Comparator.comparing(Employee::getGender)).collect(Collectors.toList());
		System.out.println(sortEmployeeGender);
		
		//How many male and female employees are there in the organization?
		Map<String, Long> collect = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(collect);
		System.out.println("--------------------------------------------");
		//Print the name of all departments in the organization?
		empList.stream().map(i -> i.getDept()).distinct().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		
		//What is the average salary of male and female employees?
		Map<String, Double> avgSalary = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		System.out.println("--------------------------------------------");
		
		//Get the details of highest paid employee in the organization
		Optional<Employee> highestSalary = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestSalary);
		System.out.println("--------------------------------------------");
		
		//Get the names of all employees who have id higher than 151
		empList.stream().filter(i->i.getEmpId() > 151).forEach(System.out::println);
		
		System.out.println("--------------------------------------------");
		
		//Count the number of employees in each department?
		Map<String, Long> countDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(countDept);
		System.out.println("--------------------------------------------");
		
		//What is the average salary of each department?
		Map<String, Double> avgSalaryDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalaryDept);
		System.out.println("--------------------------------------------");
		
		
	}

}

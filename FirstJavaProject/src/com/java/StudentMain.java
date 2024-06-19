package com.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("Puneet", 1, 85);
		Student s2 = new Student("Zemin", 4, 45);
		Student s3 = new Student("Akshat", 5, 35);
		Student s4 = new Student("Vipul", 2, 55);
		Student s5 = new Student("Deepak", 3, 95);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		List<Student> sortedArrays = list.stream().sorted(Comparator.comparingInt(Student::getId)
				.thenComparingDouble(Student :: getMarks))
				.collect(Collectors.toList());
		System.out.println(sortedArrays);
	}

}

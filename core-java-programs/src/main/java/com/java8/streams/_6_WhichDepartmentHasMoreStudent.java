package com.java8.streams;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class _6_WhichDepartmentHasMoreStudent {

	public static void main(String[] args) {
		Entry<String, Long> entry = ListOfStudents
		   .getStudents()
		   .stream()
		   .collect(Collectors.groupingBy(Student::getDept,Collectors.counting()))
		   .entrySet()
		   .stream()
		   .max(Map.Entry.comparingByValue())
		   .get();
        System.out.println(entry);
	}

}

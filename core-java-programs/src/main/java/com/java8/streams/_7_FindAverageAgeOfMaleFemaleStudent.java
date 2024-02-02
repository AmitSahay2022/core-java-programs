package com.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _7_FindAverageAgeOfMaleFemaleStudent {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
        Map<String, Double> collect = students
        		                          .stream()
        		                          .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println(collect);
	}

}

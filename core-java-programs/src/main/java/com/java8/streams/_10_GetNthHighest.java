package com.java8.streams;

import java.util.Comparator;

public class _10_GetNthHighest {

	public static void main(String[] args) {
		Student student4thHighestID = ListOfStudents
				                          .getStudents()
				                          .stream()
				                          .sorted(Comparator.comparing(Student::getId))
				                          .skip(3)
				                          .findFirst()
				                          .orElseThrow(()->new RuntimeException("Not Found"));
        System.out.println(student4thHighestID);
	}

}

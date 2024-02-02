package com.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class _9_FindStudentWithSecondHighestRank {

	public static void main(String[] args) {
		ListOfStudents.getStudents().stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Student> students = ListOfStudents.getStudents();
		 Optional<Student> findFirst = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();
       System.out.println(findFirst);
	}

}

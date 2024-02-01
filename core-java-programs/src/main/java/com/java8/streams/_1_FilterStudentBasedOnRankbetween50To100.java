package com.java8.streams;

import java.util.List;

public class _1_FilterStudentBasedOnRankbetween50To100 {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
		students
				 .stream()
				 .filter(s->s.getRank()>=50 && s.getRank()<=100)
				 .forEach(System.out::println);
		

	}

}

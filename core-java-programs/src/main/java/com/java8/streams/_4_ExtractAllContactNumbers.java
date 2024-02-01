package com.java8.streams;

import java.util.List;

public class _4_ExtractAllContactNumbers {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
        students
           .stream()
           .flatMap(s->s.getContacts().stream())  //flatMap takes stream as an argument   //collection.stream()
           .distinct()
           .forEach(System.out::println);
	}

}

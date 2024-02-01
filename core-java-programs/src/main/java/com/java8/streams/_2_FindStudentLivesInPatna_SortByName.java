package com.java8.streams;

import java.util.Comparator;
import java.util.List;

public class _2_FindStudentLivesInPatna_SortByName {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
        students
           .stream()
           .filter(s->s.getCity().equalsIgnoreCase("patna"))
           .sorted(Comparator.comparing(Student::getName))
           .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Sort based on descending order");
        students
        .stream()
        .filter(s->s.getCity().equalsIgnoreCase("patna"))
        .sorted(Comparator.comparing(Student::getName,Comparator.reverseOrder()))
        .forEach(System.out::println);
	}

}

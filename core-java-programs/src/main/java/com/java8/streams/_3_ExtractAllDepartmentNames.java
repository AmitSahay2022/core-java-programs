package com.java8.streams;

import java.util.List;

public class _3_ExtractAllDepartmentNames {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
        students
              .stream()
              .map(Student::getDept)
              .distinct()
              .forEach(d->System.out.println(d));
	}

}

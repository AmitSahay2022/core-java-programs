package com.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _5_GroupStudentByDepartmentName {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(collect);
        Map<String, Long> collect2 = students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.counting()));
        System.out.println(collect2);
	}

}

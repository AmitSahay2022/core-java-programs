package com.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class _8_FindHighestRankInEachDepartment {

	public static void main(String[] args) {
		List<Student> students = ListOfStudents.getStudents();
		Map<String, Optional<Student>> collect = students.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(collect);
	}

}

package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
	public static List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student(58, "Vickey", 43, "Male", "Science", "Patna", 98, List.of("98989","67532")));
		students.add(new Student(100, "Katrina", 23, "Female", "Arts", "Delhi", 208, List.of("90989","67532")));
		students.add(new Student(85, "Amit", 33, "Male", "Computer Science", "Patna", 38, List.of("95989","67532")));
		students.add(new Student(101, "Sumit", 33, "Male", "Management", "Delhi", 108, List.of("74989","67532")));
		students.add(new Student(103, "Riya", 43, "Female", "Management", "Mumbai", 288, List.of("98989","67532")));
		students.add(new Student(198, "Atri", 23, "Female", "Science", "Patna", 28, List.of("00989","67532")));
		students.add(new Student(193, "Britania", 19, "Female", "Arts", "Bangluru", 680, List.of("87989","67532")));
		students.add(new Student(188, "Catrina", 22, "Female", "Science", "Chennai", 980, List.of("98989","67532")));
		students.add(new Student(108, "Sunny Leone", 43, "Female", "Adult", "Kolkata", 900, List.of("43989","67532")));
		students.add(new Student(108, "Vijay", 43, "Male", "Science", "Chennai", 55, List.of("98989","67532")));
		students.add(new Student(178, "Amanda", 23, "Female", "Science", "Patna", 28, List.of("00989","67532")));
		return students;
		
	}

}

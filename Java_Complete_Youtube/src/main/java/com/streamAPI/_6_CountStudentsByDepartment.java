package com.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _6_CountStudentsByDepartment {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students = list.students();
        Map<String, Long> collect =
                students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        System.out.println(collect);
    }
}

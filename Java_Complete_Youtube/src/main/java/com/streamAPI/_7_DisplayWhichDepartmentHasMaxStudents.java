package com.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _7_DisplayWhichDepartmentHasMaxStudents {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students = list.students();
        Map.Entry<String, Long> entry = students
                .stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(entry);
    }
}

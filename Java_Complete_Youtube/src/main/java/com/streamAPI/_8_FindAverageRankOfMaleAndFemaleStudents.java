package com.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _8_FindAverageRankOfMaleAndFemaleStudents {
    public static void main(String[] args) {
        ListOfStudents students=new ListOfStudents();
        List<Student> students1 = students.students();
        Map<String, Double> collect = students1.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank)));
        System.out.println(collect);
    }
}

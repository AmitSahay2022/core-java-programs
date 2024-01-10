package com.streamAPI;

import java.util.Comparator;
import java.util.List;

public class _11_FindStudentWithThirdBestRank {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students = list.students();
        Student student = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(2).findFirst().get();
        System.out.println(student);
    }
}

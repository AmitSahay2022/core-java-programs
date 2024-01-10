package com.streamAPI;

import java.util.Comparator;
import java.util.List;

public class _10_SortStudentBasedOnRank {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students = list.students();
        students.stream().sorted(Comparator.comparing(Student::getRank)).forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------------------------------------");
        //Find Student who has second best rank
        Student student = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
        System.out.println(student);
    }
}

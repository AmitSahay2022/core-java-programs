package com.streamAPI;

import java.util.List;

//Find all student who has rank between 50-100
public class _1_FilterStudentBasedOnRank {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students= list.students();
        students.stream().filter(stu->stu.getRank()>=50 && stu.getRank()<=100).forEach(s-> System.out.println(s));
    }
}

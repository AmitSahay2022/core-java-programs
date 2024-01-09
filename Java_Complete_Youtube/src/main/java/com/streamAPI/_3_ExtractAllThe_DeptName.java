package com.streamAPI;

import java.util.List;

public class _3_ExtractAllThe_DeptName {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students=list.students();
        students.stream().map(s->s.getDept()).distinct().forEach(s-> System.out.println(s));
        System.out.println("-----------------------------------------------------------");
        //Map can be used to extract single field as well as entire object
        students.stream().map(s->s).forEach(System.out::println);
    }
}

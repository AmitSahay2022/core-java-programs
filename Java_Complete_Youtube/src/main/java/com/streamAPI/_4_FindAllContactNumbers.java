package com.streamAPI;

import java.util.List;

public class _4_FindAllContactNumbers {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> studentList=list.students();
        studentList.stream().flatMap(s->s.getContacts().stream()).distinct().forEach(s-> System.out.println(s));
    }
}

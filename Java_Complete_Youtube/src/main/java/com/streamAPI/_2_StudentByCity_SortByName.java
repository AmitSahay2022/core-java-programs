package com.streamAPI;

import java.util.Comparator;
import java.util.List;

public class _2_StudentByCity_SortByName {
    public static void main(String[] args) {
        ListOfStudents list=new ListOfStudents();
        List<Student> students=list.students();
        students
                .stream()
                .filter(s->s.getCity().equals("Patna"))
                .sorted(Comparator.comparing(Student::getName))
                .forEach(s-> System.out.println(s));
        //Sort in reverse order
        System.out.println("-----------------------------------------------------------------------");
        students.stream().filter(s->s.getCity().equals("Patna")).sorted(Comparator.comparing(Student::getName,Comparator.reverseOrder())).forEach(s-> System.out.println(s));
    }
}

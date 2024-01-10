package com.streamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _5_GroupStudentByDepartment {
    public static void main(String[] args) {
        ListOfStudents student=new ListOfStudents();
        List<Student> students=student.students();
        Map<String, List<Student>> collect =
                students.stream().collect(Collectors.groupingBy(Student::getDept));
        System.out.println(collect);

    }
}

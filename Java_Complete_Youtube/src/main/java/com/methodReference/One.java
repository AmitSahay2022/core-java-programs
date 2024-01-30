package com.methodReference;

import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Student> students=List.of(new Student("Sachin"),new Student("Rahul"));
        students.stream().forEach(Student::printName);

    }
}

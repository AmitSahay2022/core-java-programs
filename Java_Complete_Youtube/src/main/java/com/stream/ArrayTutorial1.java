package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayTutorial1 {
    public static void main(String[] args) {
        Student[] students=new Student[7];
        students[0]=new Student(101,"Ram");
        students[1]=new Student(105,"Sita");
        students[2]=new Student(102,"Lakshman");
        students[3]=new Student(104,"Bharat");
        students[4]=new Student(100,"Satruhan");
        students[5]=new Student(101,"Ram");
        students[6]=new Student(105,"Sita");

        //Remove Duplicates from ArrayList
        List<Student> list= Arrays.asList(students);

        list.stream().forEach(s-> System.out.println(s));
        System.out.println("--------------After Duplicate Remover----------");
        list.stream().distinct().forEach(s-> System.out.println(s));
    }
    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student student)) return false;
            return id == student.id && name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}

package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _2SortListObjects {
    public static void main(String[] args) {
        Student student1=new Student(101,"Amit",'B');
        Student student2=new Student(105,"Ram",'A');
        Student student3=new Student(100,"Shyam",'C');
        Student student4=new Student(108,"Raju",'C');
        Student student5=new Student(102,"Ghanshyam",'B');
        List<Student> students= Arrays.asList(student1,student2,student3,student4,student5);
        System.out.println("Before Sorting");
        students.stream().forEach(s-> System.out.println(s));
        System.out.println("---------After Sorting---------");
        //Sort the students based on Grade
        students.stream().sorted(Comparator.comparing(Student::getGrade)).forEach(s-> System.out.println(s));
    }
    private static class Student{
        private int id;
        private String name;
        private Character grade;

        public Student(int id, String name, Character grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Character getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("id=").append(id);
            sb.append(", name='").append(name).append('\'');
            sb.append(", grade=").append(grade);
            sb.append('}');
            return sb.toString();
        }
    }
}

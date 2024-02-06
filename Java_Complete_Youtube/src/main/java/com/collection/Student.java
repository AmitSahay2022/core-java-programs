package com.collection;

public class Student {
    private String name;
    private char grade;
    public Student(String name,char grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", grade=").append(grade);
        sb.append('}');
        return sb.toString();
    }
}

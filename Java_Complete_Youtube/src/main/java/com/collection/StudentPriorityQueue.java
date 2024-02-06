package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> students=new PriorityQueue<>(Comparator.comparing(Student::getGrade));
        students.add(new Student("Kartina",'b'));
        students.add(new Student("Sunny Leone",'a'));
        students.add(new Student("Leah Leone",'a'));
        students.add(new Student("Amanda Leone",'a'));
        students.add(new Student("Mandy Leone",'b'));
        students.add(new Student("Amit",'a'));
        students.add(new Student("Akshay",'b'));
        students.stream().forEach(System.out::println);
        System.out.println("----------------------------------------------");
        //Poll is used to get object out from queue
        //At the time of extraction sorting based on grade will happen
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
    }
}

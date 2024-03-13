package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
public class _90_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue=new PriorityQueue<>(Comparator.comparing(Student::getGrade));
        priorityQueue.add(new Student("Ram",Grade.A));
        priorityQueue.add(new Student("Shyam",Grade.B));
        priorityQueue.add(new Student("Rajat",Grade.C));
        priorityQueue.add(new Student("Sita",Grade.A));
        priorityQueue.add(new Student("Rahul",Grade.C));
        priorityQueue.add(new Student("Radha",Grade.B));
        priorityQueue.forEach(s-> System.out.println(s));
    }
}

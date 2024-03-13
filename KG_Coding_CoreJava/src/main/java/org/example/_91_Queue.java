package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class _91_Queue {
    public static void main(String[] args) {
        Queue<Student> studentQueue=new LinkedList<>();
        studentQueue.add(new Student("Ram",Grade.A));
        studentQueue.add(new Student("Shyam",Grade.B));
        studentQueue.add(new Student("Rajat",Grade.C));
        studentQueue.add(new Student("Sita",Grade.A));
        studentQueue.add(new Student("Rahul",Grade.C));
        studentQueue.add(new Student("Radha",Grade.B));
        studentQueue.forEach(s-> System.out.println(s));
    }
}

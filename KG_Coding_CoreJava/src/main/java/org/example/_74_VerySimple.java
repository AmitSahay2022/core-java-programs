package org.example;

public class _74_VerySimple {
    public static void main(String[] args) {
        Student student1=new Student(25,"Sunny Leone");
        System.out.println(student1);
    }
    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public String toString(){
            return this.id+" : "+this.name;
        }
    }
}

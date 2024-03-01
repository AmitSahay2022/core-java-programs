package org.example;

import java.util.Arrays;

public class _57_Course_OOPS2 {
    private String courseName;
    private int enrolledStudents;
    private int maxCapacity;
    private String[] nameOfEnrolledStudents;
    private int iCounter=0;
    public void listOfEnrolledStudents(){
        System.out.println(Arrays.toString(nameOfEnrolledStudents));
    }

    public boolean enrollStudent(String name){
        if(enrolledStudents<maxCapacity){
            System.out.println("Student is enrolled with name: "+name);
            nameOfEnrolledStudents[iCounter++]=name;
            enrolledStudents++;
            return true;
        }
        System.out.println("Oops!Batch is Full");
        return false;
    }
    public boolean unEnrollStudent(String studentName){
        for(int i=0;i<this.maxCapacity;i++){
            if(nameOfEnrolledStudents[i]==studentName){
                System.out.println(studentName+" is Discharged!");
                nameOfEnrolledStudents[i]="";
                enrolledStudents--;
                iCounter--;
                return true;
            }
        }
        System.out.println("This student is not in the batch");
        return false;
    }

    public _57_Course_OOPS2(String courseName, int enrolledStudents, int maxCapacity) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        this.maxCapacity = maxCapacity;
        nameOfEnrolledStudents=new String[maxCapacity];
    }

    public void totalNoOfenrolledStudents(){
        System.out.println(enrolledStudents);
    }

    public static void main(String[] args) {
        _57_Course_OOPS2 course1=new _57_Course_OOPS2("Core Java",0,4);
        course1.enrollStudent("Hema");
        course1.enrollStudent("Rekha");
        course1.enrollStudent("Jaya");
        course1.enrollStudent("Susma");
        course1.listOfEnrolledStudents();
        course1.unEnrollStudent("Susma");
        course1.enrollStudent("Nirma");

        course1.totalNoOfenrolledStudents();
        course1.listOfEnrolledStudents();
    }
}

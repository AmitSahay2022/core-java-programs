package org.example;

public class _59_StudentCategoryBasedOnScore {
    public static void main(String[] args) {
        System.out.println(grade(78));
    }
    public static char grade(int marks){
        if(marks>100) return 'E';
        return marks>=90?'A':marks>=75?'B':marks>=60?'C':marks>=45?'D':'F';
    }
}

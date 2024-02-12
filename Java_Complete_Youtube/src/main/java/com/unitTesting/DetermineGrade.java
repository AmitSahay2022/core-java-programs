package com.unitTesting;

public class DetermineGrade {
    public static char grade(int marks){
        if(marks<0 || marks>100) throw new IllegalArgumentException("OMG less than 0");
        if(marks>=90){
            return 'A';
        }else if(marks>=75){
            return 'B';
        } else if (marks>=60) {
            return 'C';
        } else if (marks>=45) {
            return 'D';
        }else
            return 'E';
    }
}

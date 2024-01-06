package com.sahay;

import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks out of 100");
        int marks=sc.nextInt();
        if(marks>100){return;}
        System.out.println(calculate(marks));
    }
    public static String calculate(int num){
        String grade=num > 80 ? "High": num > 50 ? "Modirate": "Low";
        return grade;
    }
}

package com.sahay;

import java.util.Scanner;

class CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.print("Enter first number ");
        Scanner sc=new Scanner(System.in);
        double a= sc.nextDouble();
        System.out.print("Enter second number ");
        double b= sc.nextDouble();
        System.out.println("Enter Operator (+ - x /)");
        char ope=sc.next().charAt(0);
        double result=switch (ope){
            case '+'->a+b;
            case '-'->a-b;
            case 'x'->a*b;
            case '/'->a/b;
            default -> 0;
        };
        System.out.println(result);
    }
}

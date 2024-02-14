package org.example;

import java.util.Scanner;

/*
input two numbers from user and a operator than return result
 */
public class _12_Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1=input.nextDouble();
        System.out.println("Enter second number");
        double num2=input.nextDouble();
        System.out.println("Enter Operator (+,-,*,/,%)");
        char operator=input.next().charAt(0);
        System.out.println("Result = "+calculator(num1,num2,operator));
    }
    public static double calculator(double num1,double num2,char operator){
        double result=0;
        switch (operator){
            case '+'-> result=num1+num2;
            case '-'->result=num1-num2;
            case '*'->result=num1*num2;
            case '/'->result=num1/num2;
            case '%'->result=num1%num2;
            default -> System.out.println("Unsupported Operator");
        }
        return result;
    }
}

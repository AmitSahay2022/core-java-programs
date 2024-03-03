package org.example;

import java.util.Scanner;

public class _61_SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Operator (+,-,x,%)");
        char operator=input.next().charAt(0);
        result(8,4,operator);
    }
    public static void result(int n1,int n2,char operator){
        switch (operator){
            case '+'-> System.out.println(n1+n2);
            case '-'-> System.out.println(n1-n2);
            case 'x'-> System.out.println(n1*n2);
            case '%'-> System.out.println(n1/n2);
            default -> System.out.println("Not Supported");
        }
    }
}

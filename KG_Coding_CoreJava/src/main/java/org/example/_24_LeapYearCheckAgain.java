package org.example;

import java.util.Scanner;

public class _24_LeapYearCheckAgain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Year to check Leap or Not");
        int year = input.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+ " is Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        //------------------------------------------------------
        System.out.println("Check Leap using improvised method");
        if(isLeapYear(year,'a')){
            System.out.println("Leap Year Hai Yaar");
        }else{
            System.out.println("Dhat Teri Ki");
        }
    }
    public static boolean isLeapYear(int year){
        if(year%400 ==0) return true;
        else if(year%100 ==0) return false;
        else if(year%4 ==0) return true;
        return false;
    }
    //Re written this code
    public static boolean isLeapYear(int year,char c){
        if(year%400==0 || (year%4==0 && year%100 !=0)){
            return true;
        }
        return false;
    }
}

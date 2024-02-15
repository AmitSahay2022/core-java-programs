package org.example;

public class _22_LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1904));
    }
    public static boolean isLeapYear(int year){
        if(year%400==0 ||year%4==0 && year%100 !=0){
            return true;
        }
        return false;
    }
}

package com.college_wallah;

import java.util.Scanner;

public class _1_CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();
        totalDigits(num);
    }
    public static void totalDigits(int num){
        int count=0;
        while (num!=0){
            count++;
            num=num/10;
        }
        System.out.println("Total number of digits= "+count);
    }
}
package com.sahay;

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        int number=5;
        int guess;
        int count=0;
        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Enter a number");
            guess=sc.nextInt();
            String hint=guess >number ?"Your number is bigger than required":"Guess bigger number";
            System.out.println(hint);
            count++;
        }while (guess !=number);
        System.out.println("Wow You reached in "+count+" attempt");
    }
}

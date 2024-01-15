package com.sahay;

import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame2 {
    public static void main(String[] args) {
        Random random=new Random();
        int number = random.nextInt(1, 10);
        Scanner s=new Scanner(System.in);
        int count=1;
        System.out.println("Enter a number between 1-100");
        while(true){

            int n=s.nextInt();
            if(n==number){
                System.out.println("You Win in "+count+" Turn");
                return;
            }else if(n<number){
                System.out.println("Enter big number");
                count++;
                continue;

            }if(n>number){
                System.out.println("Enter small number");
                count++;
                continue;
            }
        }
    }
}

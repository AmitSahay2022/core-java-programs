package org.example;

import java.util.Random;
import java.util.Scanner;

public class _64_DoWhile_NumberGuessingGame {
    public static void main(String[] args) {
       guessNumber();
    }
    public static void guessNumber(){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int num=random.nextInt(100);
        int guess=0;
        int term=0;
        do{
            term++;
            System.out.println("Enter a number between 1 to 100");
            guess=input.nextInt();
            if(guess<num){
                System.out.println("Guess Bigger number between "+guess+" "+100);
            }else
                System.out.println("Guess smaller number between "+guess+" "+1);
            if(num==guess){
                System.out.println("You Won in "+term+" term");
            }
        }while (guess!=num);
    }
}

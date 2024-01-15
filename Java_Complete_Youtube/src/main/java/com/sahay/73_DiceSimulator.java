package com.sahay;

import java.util.Random;
import java.util.Scanner;

//always number should come between 1-6
class DiceSimulator {
    public static void main(String[] args) {
        Random random=new Random();

        while (true){
            System.out.println("Do you want to role. press n for exit");
            Scanner s=new Scanner(System.in);
            char c=s.next().charAt(0);
            if(c=='n'){
                break;
            }
            int i = random.nextInt(1, 7);
            System.out.println("You Got: "+i);

        }
        //Using math.random
        int i = (int)Math.ceil(Math.random() * 6);
        System.out.println(i);
    }
}

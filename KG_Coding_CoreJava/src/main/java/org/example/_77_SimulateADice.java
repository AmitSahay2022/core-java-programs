package org.example;

import java.util.Random;

public class _77_SimulateADice {
    public static void main(String[] args) {
        for(int i=0;i<20;i++)
         System.out.print(throwDice()+" ");
        System.out.println("-------------");
        for(int i=0;i<20;i++)
         System.out.print(diceUsingMath()+" ");
    }
    public static int throwDice(){
        Random random=new Random();
        return random.nextInt(1,7);
    }
    public static int diceUsingMath(){
        return (int) Math.ceil (Math.random()*6);
    }
}

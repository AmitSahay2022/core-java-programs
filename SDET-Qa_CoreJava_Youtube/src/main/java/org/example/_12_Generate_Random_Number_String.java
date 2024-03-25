package org.example;

import java.util.Random;
import java.util.UUID;

public class _12_Generate_Random_Number_String {
    public static void main(String[] args) {
        for(int i=0;i<=20;i++)
        System.out.print(randomNumberGenerator()+" ");
        System.out.println(randomString());
    }
    public static int randomNumberGenerator(){
        Random random=new Random();
        return random.nextInt(1,7);
    }
    public static String randomString(){


        return UUID.randomUUID().toString();
    }
}

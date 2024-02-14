package org.example;

import java.util.Scanner;

public class _6_ScannerClassForUserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name= input.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Enter Your Age: ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You are illegible to vote");
        }else{
            int wait=18-age;
            System.out.println("wait for "+wait+" years to Vote");
        }
    }
}

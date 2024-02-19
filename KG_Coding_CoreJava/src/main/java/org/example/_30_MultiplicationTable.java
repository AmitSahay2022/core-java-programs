package org.example;

import java.util.Scanner;

public class _30_MultiplicationTable {
    public static void main(String[] args) {
        int number = number();
        table(number);
    }
    public static int number(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        return input.nextInt();
    }
    public static void table(int num){
        System.out.println("Multiplication Table for "+num);
        int i=1;
        while (i<=10){
            System.out.println(num+ " X "+i+" = "+(num*i));
            i++;
        }
    }
}

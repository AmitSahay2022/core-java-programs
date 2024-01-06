package com.sahay;

import java.util.Scanner;

class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char c;
        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            String result = num % 2 == 0 ? "Even Number" : "Odd Number";
            System.out.println(result);
            System.out.println("Press c for exit...");
            c=sc.next().charAt(0);

        }while (c!='c');
    }

}

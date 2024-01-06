package com.sahay;

import java.util.Scanner;

class AbsoluteValueUsing_Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int absolute=n>0 ? n: -n;
        System.out.println("Absolute Vale is: "+absolute);
    }
}

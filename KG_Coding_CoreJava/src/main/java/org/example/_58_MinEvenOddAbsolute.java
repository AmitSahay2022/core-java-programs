package org.example;

public class _58_MinEvenOddAbsolute {
    public static void main(String[] args) {
        System.out.println(min(18,19));
        System.out.println(evenOdd(8));
        System.out.println(round(7.98));
        System.out.println(absolute(-9));
    }
    public static String min(int a,int b){
        return a<b? "Minimum is: "+a:" Minimum is: "+b;
    }
    public static String evenOdd(int n){
        return n%2==0 ? "Number is Even":"Odd Number";
    }

    public static double round(double n){
        return Math.round(n);
    }
    public static int absolute(int n){
        return n>=0?n:-n;
    }
}

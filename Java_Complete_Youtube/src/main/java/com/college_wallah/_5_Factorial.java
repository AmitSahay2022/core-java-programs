package com.college_wallah;

public class _5_Factorial {
    public static void main(String[] args) {
        System.out.println(facto((byte)4));
        System.out.println(factUsingRecurson(5));
    }
    public static long facto(byte num){
        long fact=1;
        byte i=2;
        while (i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
    //---------------------------------------
    public static long factUsingRecurson(int n){
        long fact=0;
        if(n==0) return 1;
        if(n==1) return 1;
        return n*factUsingRecurson(n-1);
    }
}

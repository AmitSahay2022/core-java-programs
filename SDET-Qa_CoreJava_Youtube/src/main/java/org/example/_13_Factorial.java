package org.example;

public class _13_Factorial {
    public static void main(String[] args) {
        System.out.println(facto(5));
        System.out.println(fact(4));
    }
    public static long facto(int num){
        long fact=1;
        int start=1;
        while (start<=num){
            fact=fact*start;
            start++;
        }
        return fact;
    }
    //------Using Recursion------------
    public static long fact(int num){
        if(num<=1) return 1;
        return num*fact(num-1);
    }
}

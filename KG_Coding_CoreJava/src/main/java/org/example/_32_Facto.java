package org.example;

public class _32_Facto {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    public static long fact(int num){
        long fact=1;
        int start=1;
        while (start<=num){
            fact*=start;
            start++;
        }
        return fact;
    }
}

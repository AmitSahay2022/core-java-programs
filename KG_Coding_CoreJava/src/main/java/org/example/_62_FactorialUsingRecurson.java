package org.example;

public class _62_FactorialUsingRecurson {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static long factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
}

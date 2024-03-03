package org.example;

public class _62_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static long factorial(int n){
        int result=1;
        int start=1;
        while (start<=n){
            result=result*start;
            start++;
        }
        return result;
    }
}

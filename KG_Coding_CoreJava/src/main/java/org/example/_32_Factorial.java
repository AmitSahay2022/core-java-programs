package org.example;

public class _32_Factorial {
    public static void main(String[] args) {
        System.out.println(fact(4)); //5x4x3x2x1=120
    }
    public static int fact(int num){
        int fact=1;
        int i=1;
        while (i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}

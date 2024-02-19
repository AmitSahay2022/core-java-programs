package org.example;

public class _36_PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    public static boolean isPrime(int number){
        int start=2;
        while (start<(number/2)){
            if(number%start==0){
                return false;
            }
            start++;
        }
        return true;
    }
}

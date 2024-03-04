package org.example;

public class _66_ForLoop_PrimeCheck {
    public static void main(String[] args) {
        isPrime(18);
    }
    public static void isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0) {
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}

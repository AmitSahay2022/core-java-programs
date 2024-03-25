package org.example;

public class _11_Prime_Check {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
    public static boolean isPrime(int n){
        int i=2;
        while (i<=n/2){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
}

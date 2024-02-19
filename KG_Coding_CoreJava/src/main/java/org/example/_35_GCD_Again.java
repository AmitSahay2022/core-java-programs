package org.example;

public class _35_GCD_Again {
    public static void main(String[] args) {
        System.out.println(gcd(5,10));
    }
    public static int gcd(int num1,int num2){
        int gcd=1;
        int start=1;
        while (start<=num1){
            if((num1%start==0) && (num2%start==0)){
                gcd=start;
            }
            start++;
        }
        return gcd;
    }
}

package com.lambda;

import java.util.Scanner;
@FunctionalInterface
interface primeChecker{
    boolean isPrime(int num);
}
public class CheckPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        primeChecker checker=n->{
            int i=2;
            while (i<=n/2){
                if(n%i==0)
                    return false;
                i++;
            }
          return true;
        };
        while (true){
            System.out.println("Press e for exit");
            char c=s.next().charAt(0);
            if(c=='e'){
                return;
            }
            System.out.println("Enter a number");
            int num=s.nextInt();
            boolean result=checker.isPrime(num);
            System.out.println("Number is Prime: "+result);
        }
    }
}

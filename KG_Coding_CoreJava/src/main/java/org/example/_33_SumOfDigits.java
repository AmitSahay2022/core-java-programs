package org.example;

public class _33_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1234569l));
    }
    public static int sum(long number){
        int sum=0;
        while (number>0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}

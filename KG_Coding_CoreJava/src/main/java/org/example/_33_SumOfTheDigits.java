package org.example;

public class _33_SumOfTheDigits {
    public static void main(String[] args) {
        System.out.println(sum(345));
    }
    public static int sum(int num){
        int sum=0;
        while (num>0){
            int n=num%10;
            sum+=n;
            num/=10;
        }
        return sum;
    }
}

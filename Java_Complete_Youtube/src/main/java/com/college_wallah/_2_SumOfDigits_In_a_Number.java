package com.college_wallah;

public class _2_SumOfDigits_In_a_Number {
    public static void main(String[] args) {
        System.out.println(sum(3245));
    }
    public static int sum(int num){
        int sum=0;
        while (num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}

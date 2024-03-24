package com.college_wallah;

public class _3_Reverse_The_Digits_of_a_number {
    public static void main(String[] args) {
        System.out.println(reverse(875));
    }
    public static int reverse(int original){
        int rev=0;
        while (original!=0){
            rev=rev*10+original%10;
            original=original/10;
        }
        return rev;
    }
}

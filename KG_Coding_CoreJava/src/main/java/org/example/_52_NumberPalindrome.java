package org.example;

public class _52_NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(546));
    }
    public static boolean isPalindrome(int num){
        int n=reverse(num);
        if(n==num)return true;
        return false;
    }
    public static int reverse(int num){
        int rev=0;
        while (num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
}

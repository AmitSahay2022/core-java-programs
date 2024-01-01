package com.sahay;

import java.util.Arrays;

public class ArrayPalindromeCheck {
    public static boolean isPalindrome(int[] arr,int[] num){

        for(int i=0;i<num.length;i++){
            if(arr[i] !=num[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] num={1,2,1};
        int[] rev=ArrayReverse.reverse(num);
        System.out.println(isPalindrome(num,rev));
    }
}

package com.sahay;
/*
This is best way
 */
public class ArrayPalindromCheck2 {
    public static boolean isPalindrome(int[] arr){
        int mid=arr.length-1;
        int last=arr.length-1;
        for(int i=0;i<mid;i++){
            if(arr[i] != arr[last--]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(isPalindrome(arr));
        int[] arr2={1,2,1};
        System.out.println(isPalindrome(arr2));
    }
}

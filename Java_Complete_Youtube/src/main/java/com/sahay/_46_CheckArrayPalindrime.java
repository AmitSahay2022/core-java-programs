package com.sahay;

public class _46_CheckArrayPalindrime {
    public static void main(String[] args) {
        int[] arr1={2,3,4};
        int[] arr2={1,2,1};
        int[] arr3={5,6,4,4,6,5};
        int[] arr4={1,2,3,2,1};
        System.out.println(isPalindrome(arr1));
        System.out.println(isPalindrome(arr2));
        System.out.println(isPalindrome(arr3));
        System.out.println(isPalindrome(arr4));
    }
    public static boolean isPalindrome(int[] arr){
        int i=0;
        while (i<arr.length/2){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}

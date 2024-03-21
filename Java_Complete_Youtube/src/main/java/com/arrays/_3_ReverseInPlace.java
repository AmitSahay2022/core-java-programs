package com.arrays;

import java.util.Arrays;

public class _3_ReverseInPlace {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int lastIndex=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[lastIndex-i];
            arr[lastIndex-i]=temp;
        }
    }
}

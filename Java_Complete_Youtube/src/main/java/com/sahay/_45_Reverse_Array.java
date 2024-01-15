package com.sahay;

import java.util.Arrays;

public class _45_Reverse_Array {
    public static void main(String[] args) {
        int[] original={2,3,4,5,7};
        System.out.println(Arrays.toString(original));
        reverse(original);
        System.out.println(Arrays.toString(original));

    }
    public static void reverse(int[] arr){
        int last=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
            last--;
        }
    }
}

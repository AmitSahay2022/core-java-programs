package org.example;

import java.util.Arrays;

public class _51_ReversingArray {
    public static void main(String[] args) {
        int[] nums={5,6,8,7,4};
        reverseInPlace(nums);
        System.out.println("After Calling Reverse method");
        System.out.println(Arrays.toString(nums));
    }
    public static void reverseInPlace(int[] arr){
        int lastIndex= arr.length-1;
        for(int i=0;i< arr.length/2;i++){
            //Swap
            int temp=arr[i];
            arr[i]=arr[lastIndex];
            arr[lastIndex]=temp;
            lastIndex--;
        }
    }
}

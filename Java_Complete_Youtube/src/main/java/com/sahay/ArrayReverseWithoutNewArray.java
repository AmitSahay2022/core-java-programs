package com.sahay;

import java.util.Arrays;

public class ArrayReverseWithoutNewArray {
    public static int[] reverse(int[] arr){
        int mid=arr.length/2;
        int lastIndex=arr.length-1;
        for(int i=0;i<mid;i++){
            int temp=arr[i];
            arr[i]=arr[lastIndex];
            arr[lastIndex]=temp;
            lastIndex--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original1={3,4,5};
        int[] original2={5,6,7,8};
        System.out.println(Arrays.toString(reverse(original1)));
        System.out.println(Arrays.toString(reverse(original2)));
    }
}

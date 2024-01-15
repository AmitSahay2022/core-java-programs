package com.sahay;

import java.util.Arrays;

public class _47_MegreTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,3,4,9,18};
        int[] arr2={1,5,7,8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    public static int[] merge(int[] arr1,int[] arr2){
        if(arr1.length>arr2.length){
            return mergeLogic(arr2,arr1);
        }else
            return mergeLogic(arr1,arr2);
    }
    public static int[] mergeLogic(int[] arr1,int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        int imax=arr1.length-1;
        int j=0;
        int jmax=arr2.length-1;
        int k=0;
        while (i<=imax || j<=jmax){
            if((i<=imax) && arr1[i]<arr2[j] ||j>jmax){
                arr3[k]=arr1[i];
                i++;k++;
            }else {
                arr3[k]=arr2[j];
                j++; k++;
            }
        }
        return arr3;
    }
}

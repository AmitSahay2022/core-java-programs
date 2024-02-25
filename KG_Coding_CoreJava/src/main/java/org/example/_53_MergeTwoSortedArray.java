package org.example;

import java.util.Arrays;

public class _53_MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1={2,3,4,8};
        int[] arr2={1,5,7,9,10};
        System.out.println(Arrays.toString(mergeSolver(arr1,arr2)));
    }
    public static int[] mergeSolver(int[] arr1,int[] arr2){
        if(arr2.length>arr1.length){
            return merge(arr2,arr1);
        }else
            return merge(arr1,arr2);
    }
    public static int[] merge(int[] arr1,int[] arr2){ //Second arr should not have more elements than first arr
        int[] result=new int[arr1.length+arr2.length];
        int i=0,imax=arr1.length-1;
        int j=0,jmax=arr2.length-1;
        int k=0,kmax= result.length-1;
        while (i<=imax || j<jmax){
            if(j>jmax ||(i<=imax) && arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
                k++;
            }else {
                result[k]=arr2[j];
                j++;
                k++;
            }
        }
        return result;
    }
}

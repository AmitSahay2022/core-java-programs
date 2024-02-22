package org.example;

public class _49_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1={5,6,7,8};
        int[] arr2={6,5,4};
        int[] arr3={5,4,7,8,2};
        System.out.println(isSorted(arr2));
    }
    public static boolean isSorted(int[] arr){
        boolean result=isAssending(arr) || isDescending(arr);
        return result;
    }
    public static boolean isAssending(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static boolean isDescending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1])
                return false;
        }
        return true;
    }
}

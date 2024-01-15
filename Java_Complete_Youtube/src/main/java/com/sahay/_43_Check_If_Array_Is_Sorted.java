package com.sahay;

public class _43_Check_If_Array_Is_Sorted {
    public static boolean isAssending(int[] arr){
        int start=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(start>arr[i+1]){
                return false;
            }else{
                start=arr[i];
            }
        }
        return true;
    }
    public static boolean isDescending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSorted(int[] arr){
        if(isAssending(arr) || isDescending(arr)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int[] arr2={4,3,2};
        int[] arr3={3,5,2};
        System.out.println(isSorted(arr));
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3));
    }
}

package com.sahay;

public class ArraySortedCheck {
    public static boolean isSorted(int[] arr){
        if(isAssending(arr) || isDescending(arr)){
            return true;
        }
        return false;
    }
    public static boolean isAssending(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isDescending(int[] arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] num1={1,2,3,4,5};
        int [] num2={1,2,3,5,4,7};
        int [] num3={5,4,3,2,1};
        int[] num4={5,4,3,1,2,1};
        System.out.println(isSorted(num1));
        System.out.println(isSorted(num2));
        System.out.println(isSorted(num3));
        System.out.println(isSorted(num4));
    }
}

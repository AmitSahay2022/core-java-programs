package org.example;

public class _48_Max_Min_Array {
    public static void main(String[] args) {
        int[] nums={5,8,9,2,4,7};
        System.out.println(max(nums));
        System.out.println(min(nums));
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int x:arr){
            if(max<x)
                max=x;
        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for(int x:arr){
            if(min>x)
                min=x;
        }
        return min;
    }
}

package com.sahay;

public class Array_MinMax {
    public static int min(int[] arr){
        int min=arr[0];
        int i=1;
        while (i<arr.length){
            if(arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={6,3,4,2,9,7,5};
        System.out.println("Minimum= "+min(arr));
        System.out.println("Maximum= "+max(arr));
    }
}

package com.sahay;

import java.util.Arrays;

public class ArrayElementDelete {
    public static int[] deleteElement(int[] arr,int itemToDelete){
        int numberOfOccurance=numberOfOccurance(arr,itemToDelete);
        if(numberOfOccurance==0){
            return arr;
        }
        int newSize=arr.length-numberOfOccurance;
        int [] newarr=new int[newSize];
        int j=0;
        for (int i=0;i<arr.length;i++){

            if(itemToDelete==arr[i]){
                continue;
            }
            newarr[j++]=arr[i];
        }
        return newarr;
    }
    public static int numberOfOccurance(int[] arr,int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num={3,4,5,4,4};
        System.out.println(Arrays.toString(deleteElement(num,4)));
    }
}

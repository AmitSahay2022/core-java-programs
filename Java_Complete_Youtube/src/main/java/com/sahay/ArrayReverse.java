package com.sahay;

public class ArrayReverse {
    public static int[] reverse(int [] arr){
        int[] reverse=new int[arr.length];
        int lastIndex=arr.length-1;
        int i=0;
        while (lastIndex>=0){
            reverse[i++]=arr[lastIndex];
            lastIndex--;
        }
        return reverse;
    }

}

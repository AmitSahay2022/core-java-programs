package org.example;

import java.util.Arrays;

public class _51_ReverseArray {
    public static void main(String[] args) {
        int[] num={5,6,7};
        int[] reverse=reverse(num);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] reverse(int[] arr){
        int[] newArr=new int[arr.length];
        int x=0;
        for(int i=arr.length-1;i>=0;i--){
            newArr[x++]=arr[i];
        }
        return newArr;
    }
}

package org.example;

import java.util.Arrays;

public class _50_DeleteAnElementInArray {
    public static void main(String[] args) {
        int[] nums={6,3,5,6,8,4,3};
        System.out.println(Arrays.toString(deleteElement(nums,3)));
    }
    public static int[] deleteElement(int[] arr,int item){
        int occurance = numberOfOccurance(arr, item);
        int[] newArr=new int[arr.length-occurance];
        int index=0;
        for(int i:arr){
            if(i==item)
                continue;
            newArr[index++]=i;
        }
        return newArr;
    }
    public static int numberOfOccurance(int[] arr,int i){
        int times=0;
        for(int x:arr){
            if(x==i)times++;
        }
        return times;
    }
}

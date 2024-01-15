package com.sahay;

import java.util.Arrays;

public class _44_Delete_one_Element_Return_new_Array {
    public static int[] deleteItem(int[] arr,int item){
        int found=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==item){
                found++;
            }
        }
        if(found==0){
            System.out.println("Number not found to delete");
            return arr;
        }

        int[] newArr=new int[arr.length-found];
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                continue;
            }
            newArr[j++]=arr[i];
        }


        return newArr;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,6};
        System.out.println(Arrays.toString(deleteItem(arr,4)));
    }
}

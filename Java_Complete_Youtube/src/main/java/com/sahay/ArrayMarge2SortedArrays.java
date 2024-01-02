package com.sahay;

import java.util.Arrays;

public class ArrayMarge2SortedArrays {

    public static int[] marger(int[] arr1,int[] arr2){
        if(arr2.length<arr1.length){
            return marge(arr2,arr1);
        }else{
            return marge(arr1,arr2);
        }
    }
    public static int[] marge(int[] arr1,int[] arr2){

        int newSize=arr1.length+arr2.length;
        int[] result=new int[newSize];

        int i=0;//this will point arr1 index
        int imax=arr1.length-1;// last index of arr1
        int j=0;//this will point arr2 index
        int jmax=arr2.length-1;

        int k=0; //this will point result array index

        while(i<=imax || j<=jmax){
            if( (i<=imax) && (arr1[i]<arr2[j]) || j>jmax){
                result[k]=arr1[i];
                i++;
                k++;
            }
            else {
                result[k]=arr2[j];
                j++;
                k++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] odds={1,3,5,7,9};
        int[] even={2,4,6,8,10};
        System.out.println(Arrays.toString(marge(odds,even)));
        int[] num1={1,2,3};
        int[] num2={4,5,6,7,8};
        System.out.println(Arrays.toString(marge(num1,num2)));
        //------There is one problem if second array is small then it throws ArrayIndexOutOfBoundsException
        int[] one={5,6,7,8,9};
        int[] two={2,3};
        System.out.println(Arrays.toString(marge(two,one)));
        //Solved that problem using marger method which is replacing argument positions
        System.out.println(Arrays.toString(marger(one,two)));
    }
}

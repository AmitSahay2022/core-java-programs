package com.arrays;

import java.util.Arrays;

public class _2_FindCommonElementsInTwoArray {
    public static void main(String[] args) {
        int[] n={4,8,5,9};
        int[] p={5,8,0,2};
        System.out.println(Arrays.toString(findCommon(n,p)));
    }
    public static int[] findCommon(int[] num1,int[] num2){
        //Check if there are commons
        int common=0;
        for(int n:num1){
            for(int p:num2){
                if(n==p){
                    common++;
                }
            }
        }
        int[] commonElements=new int[common];
        //Add common elements in this array
        int index=0;
        for(int n:num1){
            for (int p:num2){
                if(n==p){
                    commonElements[index]=n;
                    index++;
                }
            }
        }
        return commonElements;
    }
}

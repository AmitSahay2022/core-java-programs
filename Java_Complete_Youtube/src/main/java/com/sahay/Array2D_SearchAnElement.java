package com.sahay;

public class Array2D_SearchAnElement {
    public static boolean search(int[][] arr2D,int itemToSearch){
        for(int[] arr:arr2D){
            for(int x:arr){
                if(x==itemToSearch)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] myArray={{2,5,8},{4,7,6},{5,8}};
        System.out.println(search(myArray,7));
    }
}

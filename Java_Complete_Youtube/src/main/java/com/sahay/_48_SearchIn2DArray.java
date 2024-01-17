package com.sahay;

public class _48_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D={{3,4,5},{6,7}};
        System.out.println(findItem(arr2D,9));
    }
    public static boolean findItem(int[][] arr,int find){
        for(int[] x:arr){
            for(int a:x){
                if(a==find){
                    System.out.println("Item Found");
                    return true;
                }
            }
        }
        System.out.println("Item not found!");
        return false;
    }
}

package com.sahay;

public class Array2D_SumAndAve_ofAllElements {
    public static int sumOfAllElements(int[][] arr2D){
        int total=0;
        for(int[] arr:arr2D){
            for (int x:arr){
                total+=x;
            }
        }
        return total;
    }
    public static double average(int[][] arr2D){
        double total=sumOfAllElements(arr2D);
        int numberOfItems=0;
        for(int[] arr:arr2D){
            for (int x:arr){
                numberOfItems++;
            }
        }
        return total/numberOfItems;
    }
    public static void main(String[] args) {
        int[][] arr2D={{3,8,6},{6,9,2}};
        System.out.println(sumOfAllElements(arr2D));
        System.out.println(average(arr2D));
    }
}

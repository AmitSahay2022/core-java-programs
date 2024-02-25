package org.example;

import java.math.BigDecimal;

public class _54_SumAvarage2DArray {
    public static void main(String[] args) {
        int[][] nums={{1,4,7},{3,2,9},{5,4,8}};
        System.out.println(sum(nums));
        System.out.println(average(nums));
    }
    public static int sum(int[][] arr){
        int sum=0;
        for(int[] a:arr){
            for(int n:a){
                sum+=n;
            }
        }
        return sum;
    }
    public static double average(int[][] arr){
        double sum=sum(arr);
        int totalElement=0;
        for(int[] a:arr){
            totalElement+=a.length;
        }
        return sum/totalElement;
    }
}

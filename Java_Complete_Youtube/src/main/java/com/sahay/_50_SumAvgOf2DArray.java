package com.sahay;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class _50_SumAvgOf2DArray {
    static class Result{
        int sum;
        int totalItem;
        public Result(int sum,int item){
            this.sum=sum;
            this.totalItem=item;
        }
    }
    public static Result sum(int[][] arr){

        int sum=0;
        int totalItem=0;
        int i=0;
        while (i< arr.length){
            int j=0;
            while (j<arr[i].length){
                sum+=arr[i][j];
                totalItem++;
                j++;
            }
            i++;
        }
        Result result=new Result(sum,totalItem);
        return new Result(sum,totalItem);
    }
    public static double avg(int [][] arr){
        double avg=0;
        Result result=sum(arr);
        double sum=result.sum;
        int items=result.totalItem;
        avg=sum/items;
        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP)  );
        return avg;
    }
    public static void main(String[] args) {
        int[][] arr={{4,3,7},{5,1,9}};
        avg(arr);
    }
}

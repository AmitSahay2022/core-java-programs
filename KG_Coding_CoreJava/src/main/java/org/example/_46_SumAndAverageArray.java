package org.example;

public class _46_SumAndAverageArray {
    public static void main(String[] args) {
        int[] arr={56,34,21,58,76};
        System.out.println(sum(arr));
        System.out.println(average(arr));
    }
    public static double sum(int[] arr){
        double sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }
    public static double average(int[] arr){
        double sum=sum(arr);
        return sum/arr.length;
    }
}

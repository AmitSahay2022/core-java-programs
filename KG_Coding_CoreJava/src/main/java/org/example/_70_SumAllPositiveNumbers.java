package org.example;

public class _70_SumAllPositiveNumbers {
    public static void main(String[] args) {
        int[] arr={5,7,-3,-5,6,-7,9};
        System.out.println(sumPositive(arr));
        System.out.println(sumPositiveUsingContinue(arr));
    }
    public static int sumPositive(int[] arr){
        int sum=0;
        for(int n:arr){
            if(n>0){
                sum+=n;
            }
        }
        return sum;
    }
    public static int sumPositiveUsingContinue(int[] arr){
        int sum=0;
        for(int n:arr){
            if(n<0){
                continue;
            }
            sum+=n;
        }
        return sum;
    }
}

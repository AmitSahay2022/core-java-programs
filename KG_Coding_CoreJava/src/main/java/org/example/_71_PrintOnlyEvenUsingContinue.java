package org.example;

public class _71_PrintOnlyEvenUsingContinue {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8,9,24};
        printEven(arr);
    }
    public static void printEven(int[] arr){
        for(int n:arr){
            if(n%2==1)
                continue;
            System.out.print(n+" ");
        }
    }
}

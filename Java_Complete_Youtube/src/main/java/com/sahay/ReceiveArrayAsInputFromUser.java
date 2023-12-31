package com.sahay;

import java.util.Arrays;
import java.util.Scanner;

public class ReceiveArrayAsInputFromUser {
    public static int sum(int[] arr){
        int total=0;
        for (int i:arr) {
            total+=i;
        }
        return total;
    }
    public static double average(int[] arr){
        double total=sum(arr);
        int n=arr.length;
        return total/n;
    }
    public static void main(String[] args) {
        int[] arr= ArrayUtility.receaveArray();
        System.out.println(sum(arr));
        System.out.println(average(arr));
    }
}

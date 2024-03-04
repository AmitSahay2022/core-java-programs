package org.example;

import java.util.Arrays;

public class _68_forEach_Occurance_Of_Element {
    public static void main(String[] args) {
        int[] arg={3,8,7,5,9,5,3,5};

        //Number of occurence for each item
        Arrays.stream(arg).distinct().forEach(e->occured(arg,e));
    }
    public static void occured(int[] arr,int n){
        int count=0;
        for(int i:arr){
            if(n==i)
                count++;
        }
        System.out.println(n+" occured "+count+" times");
    }
}

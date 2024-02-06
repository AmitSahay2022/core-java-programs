package com.collection;

import java.util.List;
import java.util.Scanner;

public class FindFrequencyLogic {
    public static void main(String[] args) {
        List<Integer> nums=List.of(6,7,6,8,9,2,4,7,5,6);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int n=sc.nextInt();
        int count=0;
        for(int i:nums){
            if(i==n)count++;
        }
        System.out.println(n+" found "+count+" times");
    }
}

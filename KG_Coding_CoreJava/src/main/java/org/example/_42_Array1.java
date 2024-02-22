package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*
receive 10 integer(marks) and calculate it's average
 */
public class _42_Array1 {
    public static void main(String[] args) {
        int[] num=new int[10];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println("Enter "+(i+1)+" marks");
            num[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int sum=0;
        for(int n:num){
            sum+=n;
        }
        System.out.println("Total is "+sum+" Average is: "+sum/num.length);
    }
}

package org.example;

import java.util.Scanner;

public class _43_SearchingInArray {
    public static void main(String[] args) {
        int[] nums={50,67,54,32,46,78};
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number to Search");
        int search=input.nextInt();
        System.out.println(searchInArray(nums,search));
    }
    public static String searchInArray(int[] arr,int number){
        for(int n:arr){
            if(n==number) return "Found";
        }
        return "Not Found";
    }
}

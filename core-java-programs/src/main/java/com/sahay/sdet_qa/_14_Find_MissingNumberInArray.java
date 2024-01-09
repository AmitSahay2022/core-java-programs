package com.sahay.sdet_qa;

public class _14_Find_MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,8,9};
		System.out.println("Missing element is :"+missing(arr));

	}
	public static int missing(int[] arr) {
		//find minimum element //find maximum element //find actual sum
		int min=arr[0];
		int max=arr[0];
		int actualSum=0;
		for(int x:arr) {
			if(min>x) {
				min=x;
			}
			if(max<x) {
				max=x;
			}
			actualSum+=x;
		}
		
		//find required sum 
		int requiredSum=0;
		for(int i=min; i<=max;i++) {
			requiredSum+=i;
		}	
		
		//return the difference
		return requiredSum-actualSum;
	}

}

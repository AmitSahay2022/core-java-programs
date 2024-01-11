package com.sahay.youtube_kgcoding;

import java.util.Arrays;

public class _40_SumAndAverage_OfArrayElements {

	public static void main(String[] args) {
		int[] nums= {4,3,2,7,6,5,8,0,9,2};
        System.out.println(sumOfElements(nums));
        System.out.println(average(nums));
        
	}
	public static int sumOfElements(int[] arr) {
		int sum=0;
		int i=0;
		while(i<arr.length) {
			sum=sum+arr[i];
			i++;
		}
		return sum;
	}
	public static double average(int[] arr) {		
		double total=sumOfElements(arr);
		int items=arr.length;
		double average=total/items;
		return average;
	}

}

package com.sahay.sdet_qa;

import java.util.Arrays;

public class _19_BubbleSortArray {

	public static void main(String[] args) {
		int[] arr= {2,8,1,4,9,3,3,5,0};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
	}
	public static void sortArray(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}

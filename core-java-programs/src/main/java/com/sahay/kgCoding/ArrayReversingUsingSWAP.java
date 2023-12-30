package com.sahay.kgCoding;

import java.util.Arrays;
/*
 * {2,3,4,5,7}
 * 
 */
public class ArrayReversingUsingSWAP {
	public static int[] swap(int[] arr) {
		int index=arr.length-1;           //4                7
		for(int i=0;i<arr.length/2;i++) { //<2 (0,1)         <3 (0,1,2)
			int temp=arr[index]; 
			arr[index]=arr[i];
			arr[i]=temp;
			index--;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] numbers= {3,2,8,1,9};  //length=5
		System.out.println(Arrays.toString(swap(numbers)));
		int[] num= {4,5,2,1,7,8,9,10}; //length=8
		System.out.println(Arrays.toString(swap(num)));

	}

}

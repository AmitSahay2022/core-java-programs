package com.sahay.kgCoding;

import java.util.Arrays;

public class ArrayReverseUsingAnotherArray {
	public static int[] reverse(int[] arr) {
		int[] reverse=new int[arr.length];
		int x=0;
		for(int i=arr.length-1;i>=0;i--) {
			reverse[x]=arr[i];
			x++;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int[] num= {3,4,5,2,1};
		System.out.println(Arrays.toString(reverse(num)));

	}

}

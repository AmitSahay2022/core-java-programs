package com.sahay.kgCoding;

public class ArrayMaxMinElement {

	public static int max(int[] arr) {
		int max=arr[0];
		for(int n:arr) {
			if(n>max)
				max=n;
		}
		return max;
	}
	public static int min(int[] arr) {
		int min=arr[0];
		for(int n:arr) {
			if(n<min)
				min=n;
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] numbers= {2,5,1,3,4,-2,6,8,3,9,0};
		System.out.println("Max element= "+max(numbers));
		System.out.println("Min Element= "+min(numbers));

	}

}

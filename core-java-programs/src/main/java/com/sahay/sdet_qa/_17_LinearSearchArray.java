package com.sahay.sdet_qa;

public class _17_LinearSearchArray {

	public static void main(String[] args) {
		int[] arr= {3,7,9,2,6,1,5};
        System.out.println(find(arr, 1));
	}
	
	public static boolean find(int[] arr,int num) {
		for(int n:arr) {
			if(n==num) {
				return true;
			}
		}
		return false;
	}

}

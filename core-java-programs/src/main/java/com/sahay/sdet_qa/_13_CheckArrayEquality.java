package com.sahay.sdet_qa;

public class _13_CheckArrayEquality {

	public static void main(String[] args) {
		int[] num1= {1,2,3,4};
		int[] num2= {1,2,3,4};
		System.out.println(isEqual(num1, num2));
	}
	public static boolean isEqual(int[] arr1,int[] arr2) {
		if(arr1.length !=arr2.length) {
			return false;
		}
		int lastIndex=arr1.length-1;
		for(int i=0;i<=lastIndex;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}

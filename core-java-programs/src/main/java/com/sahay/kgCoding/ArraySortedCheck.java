package com.sahay.kgCoding;

public class ArraySortedCheck {
	public static boolean isSorted(int[] arr) {
		boolean result=true;
		int first=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(first<=arr[i]) {
				first=arr[i];
				continue;
			}else {
				return false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr1= {3,4,5,6,7,8};
		int[] arr2= {4,6,8,2};
		System.out.println("First Array is Sorted: "+isSorted(arr1));
		System.out.println("Second Array is Sorted: "+isSorted(arr2)); 
		
	}

}

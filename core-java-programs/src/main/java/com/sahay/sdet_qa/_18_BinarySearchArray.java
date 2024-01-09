package com.sahay.sdet_qa;

public class _18_BinarySearchArray {

	public static void main(String[] args) {
		// Array should be sorted for binary search
        int[] arr= {2,3,4,5,6,7,15,25,56};
        System.out.println(binarySearch(arr, 25));
	}
	public static boolean binarySearch(int[] arr,int num) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(num==arr[mid]) {
				return true;
			}if(num>arr[mid]) {
				start=mid+1;
			}if(num<arr[mid]) {
				end=mid-1;
			}
		}
		return false;
	}

}

package com.sahay.youtube_kgcoding;

public class _41_NumberOfOccuranceOfAnElementInArray {

	public static void main(String[] args) {
		int[] arr= {4,3,2,6,7,4,5,7,4};
        System.out.println(countOccurance(arr, 7));
	}
	public static int countOccurance(int[] arr,int number) {
		int count=0;
		int i=0;
		while(i<arr.length) {
			if(number==arr[i])
				count++;
			i++;
		}
		return count;
	}

}

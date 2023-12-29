package com.sahay.kgCoding;

public class ArraySum_average {
	public static double sum(int [] arr) {
		double sum=0;
		for(int x:arr) {
			sum=sum+x;
		}
		return sum;
	}
	public static double average(int[] arr) {
		double avg=0;
		int allElements=arr.length;
		double total=sum(arr);
		avg=total/allElements;
		
		return avg;
	}

	public static void main(String[] args) {
		int[] numbers= {5,7,3,1,6,8,9,4,1,3,5};
		System.out.println(sum(numbers));
		System.out.println(average(numbers));

	}

}

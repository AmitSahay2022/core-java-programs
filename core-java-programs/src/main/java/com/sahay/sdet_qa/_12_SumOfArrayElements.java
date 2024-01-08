package com.sahay.sdet_qa;

public class _12_SumOfArrayElements {

	public static void main(String[] args) {
		int [] nums= {4,5,6,7,10};
		int sum=0;
        for(int n:nums) {
        	sum+=n;
        }
        System.out.println(sum);
	}

}

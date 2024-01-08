package com.sahay.sdet_qa;

public class _15_Find_MinMax_Array {

	public static void main(String[] args) {
		int[] nums= {3,2,4,5,7,1,9,5};
        int min=nums[0];
        int max=nums[0];
        for(int n:nums) {
        	if(n>max) {
        		max=n;
        	}
        	if(n<min) {
        		min=n;
        	}
        }
        System.out.println("Minimum= "+min+" Maximum= "+max);
	}

}

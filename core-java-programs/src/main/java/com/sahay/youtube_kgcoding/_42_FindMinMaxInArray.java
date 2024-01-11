package com.sahay.youtube_kgcoding;

public class _42_FindMinMaxInArray {

	public static void main(String[] args) {
		int[] nums= {2,4,5,7,3,2,1,9,5};
        int i=0;
        int min=nums[0];
        int max=nums[0];
        while(i<nums.length) {
        	if(min>nums[i]) {
        		min=nums[i];
        	}
        	if(max<nums[i]) {
        		max=nums[i];
        	}
        	i++;
        }
        System.out.println("Minimum= "+min+" Maximum= "+max);
	}

}

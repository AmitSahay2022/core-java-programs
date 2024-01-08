package com.sahay.sdet_qa;

public class _16_Duplicate_In_Array {

	public static void main(String[] args) {
		int[] nums= {3,2,4,5,7,1,9,5,1};        
        
        for(int j=0;j<nums.length;j++) { 
        	int n=nums[j];
        	int count=0;
        	
        	for(int i=j+1;i<nums.length;i++) {
        		if(n==nums[i]) {
        			count++;
        		}
        	}
        	if(count>=1) {
        		System.out.println(n +" is duplicate");
        	}
        }
        
	}

}

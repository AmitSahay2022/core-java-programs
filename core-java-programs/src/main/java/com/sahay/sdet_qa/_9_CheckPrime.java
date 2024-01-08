package com.sahay.sdet_qa;

public class _9_CheckPrime {

	public static void main(String[] args) {
		check(19);

	}
    public static void check(int num) {
    	if(num<0)return;
    	if(num==1) {
    		System.out.println("Prime");
    		return;
    	}
    	int i=2;
    	while(i<=num/2) {
    		if(num%i==0) {
    			System.out.println("Not a Prime number");
    			return;
    		}
    		i++;
    	}
    	System.out.println("Prime number");
    }
}

package com.sahay.kgCoding;

public class SumAllOddNumbersBitweenRange {

	public static int oddSum(int range) {
		int i=1;
		int oddSum=0;
		while(i<=range) {
			oddSum+=i;
			i+=2; //because next odd number is always current+2
		}
		return oddSum;
	}
	
	public static void main(String[] args) {
		System.out.println(oddSum(7));//1+3+5+7

	}

}

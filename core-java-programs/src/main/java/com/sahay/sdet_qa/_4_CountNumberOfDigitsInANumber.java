package com.sahay.sdet_qa;

public class _4_CountNumberOfDigitsInANumber {

	public static void main(String[] args) {
		int num=98347;
		System.out.println(count(num));

	}
	public static int count(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}

}

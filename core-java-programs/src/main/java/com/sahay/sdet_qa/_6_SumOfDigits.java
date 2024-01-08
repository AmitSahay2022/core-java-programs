package com.sahay.sdet_qa;

public class _6_SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sum(456));
 
	}
	public static int sum(int num) {
		int sum=0;
		while(num>0) {
			int lastDigit=num%10;
			sum+=lastDigit;
			num/=10;
		}
		return sum;
	}

}

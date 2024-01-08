package com.sahay.sdet_qa;

public class _2_ReverseANumber {

	public static void main(String[] args) {
		int num=123;
		int reverse=reverse(num);
        System.out.println(reverse);  
	}
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int lastDigit=num%10;
			rev=rev*10+lastDigit;
			num=num/10;
		}
		return rev;
	}

}

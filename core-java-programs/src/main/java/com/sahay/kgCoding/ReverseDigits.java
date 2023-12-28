package com.sahay.kgCoding;

public class ReverseDigits {
	public static int reverse(int num) { //if num=786
		int reverse=0;
		while(num>0) {
			int lastDigit=num%10;  //6  8  7
			reverse=reverse*10+lastDigit; //6  6x10+8=68   68x10+7=687
			num=num/10;  //78  7  0
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverse(786));
		System.out.println(reverse(123));

	}

}

package com.sahay.sdet_qa;

public class _11_Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}
	
	public static int factorial(int num) { //if num=5 than fact=1x2x3x4x5=120
		int fact=1;
		int i=1;
		while(i<=num) { 
			fact=fact*i;
			i++;
		}
		return fact;
	}

}

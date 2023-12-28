package com.sahay.kgCoding;

public class Factorial {
	public static long factorial(int number) {
		long fact=1;
		if(number<2) {
			return 1;
		}
		int i=2;		
		
		while(i<=number) { // fact or say result, we have to multiply result x result-1 and add it to result
			
			fact*=i;
			i++;
			
		}
		
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5)); //5x4x3x2x1=120

	}

}

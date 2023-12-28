package com.sahay.kgCoding;
/*
 * 153 =1x1x1 +5x5x5 + 3x3x3 =153 hence Armstrong
 * 1634 = 1x1x1x1 + 6x6x6x6 + 3x3x3x3 +4x4x4x4 =1634 hence Armstrong
 * 1 to 9 is Armstrong 
 */
public class ArmstrongNumberCheck {
	//Check number of Digits
	public static int numberOfDigits(int number) {
		int count=0;
		while(number>0) {
			count++;
			number /=10;
		}
		return count;
	}
	//find power of number
	public static int power(int num,int pow) {
		int value=num;
		while(pow>1) {
			value*=num;
			pow -=1;
		}
		return value;
	}
	public static boolean isArmstrong(int number) {
		boolean result=false;
		int copy=number;
		
		//Extract number digits
		int digits = numberOfDigits(number);
		
		int total=0;
		//Extract each decimal number from number
		while(number>0) {
			int n=number%10;
			int v = power(n, digits);
			total=total+v;
			number /=10;
		}
		if(copy==total) {
			return true;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(1634));

	}

}

package com.sahay.sdet_qa;

public class _5_CountEven_Odd_Digits {

	public static void main(String[] args) {
		countEvenOdd(2345786);

	}
	public static void countEvenOdd(int num) {
		int even=0;
		int odd=0;
		while(num>0) {
			int lastDigit=num%10;
			if(lastDigit%2==0) {
				even++;
			}else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("Total even digits= "+even+" Odd digits= "+odd);
	}

}

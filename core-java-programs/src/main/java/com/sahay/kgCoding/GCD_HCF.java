package com.sahay.kgCoding;

public class GCD_HCF {
	public static void hfcOrGCD(int num1,int num2) {
		int hcf=1;
		int small = small(num1,num2);
		int i=1;
		while(i<=small) {
			if(num1 %i==0 && num2 %i==0) {
				hcf=i;
			}
			i++;
		}
		System.out.println(hcf);
	}
	public static int small(int a,int b) {
		if(a<b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		hfcOrGCD(30, 15);

	}

}

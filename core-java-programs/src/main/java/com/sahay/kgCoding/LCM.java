package com.sahay.kgCoding;

public class LCM {
	
	public static int lcm(int num1,int num2) {
		int lcm=1;
		while(true) {
			if(lcm%num1==0 && lcm%num2==0) {
			return lcm;
			}
			else
				lcm++;
		}
		
		
	}

	public static void main(String[] args) {
		System.out.println(lcm(2,4));

	}

}

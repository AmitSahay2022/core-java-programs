package com.sahay.kgCoding;

public class PalindromeCheck {
	
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int number=132;
		int reverse = reverse(number);
		if(number==reverse) {
			System.out.println("Palindrome True");
		}else {
			System.out.println("False");
		}

	}

}

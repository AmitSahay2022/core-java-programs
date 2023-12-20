package com.sahay.basic;

public class SwapInteger4 {
	public static void swap(int a,int b) {
		System.out.println("Before Swapping: "+a+" "+b );
		a=a^b; 
		b=a^b;
		a=a^b;
		System.out.println("After Swapping: "+a+" "+b );
	}

	public static void main(String[] args) {
		swap(5,9);
	}

}

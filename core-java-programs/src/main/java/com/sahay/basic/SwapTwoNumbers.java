package com.sahay.basic;
/*
 * Swap two numbers using temp variable
 */
public class SwapTwoNumbers {
	
	public static void swap(int a,int b) {
		System.out.println("Before swapping: "+a+" "+b);
		int temp=a; //now a is safe
		a=b; //now value of b is safe inside a
		b=temp; 
		System.out.println("After swapping: "+a+" "+b);
	}
	
	public static void main(String[] args) {
        swap(5,8);
	}
}

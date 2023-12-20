package com.sahay.basic;

public class SwapInteger2 {
	public static void swap(int a,int b) {
		System.out.println("Before Swapping: "+a+" "+b );
		a=a+b;   //if a=5 and b=10 than a=15
		b=a-b;   //b=15-10=5
		a=a-b;   //a=15-b which is 5 hence a=10 
		System.out.println("After Swapping: "+a+" "+b);
	}

	public static void main(String[] args) {
		swap(5,32);

	}

}

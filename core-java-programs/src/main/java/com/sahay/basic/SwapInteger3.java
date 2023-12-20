package com.sahay.basic;

public class SwapInteger3 {
	
	public static void swap(int x,int y) {
		System.out.println("Before Swapping: "+x+" "+y );
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("After Swapping: "+x+" "+y);
	}

	public static void main(String[] args) {
		swap(31,82);

	}

}

package com.sahay.sdet_qa;

public class _1_SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		//System.out.println("Before Swapping: "+a+" "+b);
        swap(a, b);
       // System.out.println("After swapping "+a+" "+b);
        swap2(a, b);
        swap3(a, b);
	}
	public static void swap(int x,int y) {
		System.out.println("Before Swapping: "+x+" "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping "+x+" "+y);
	}
	
	public static void swap2(int x,int y) {  // if x=10 y=20
		System.out.println("Before Swapping: "+x+" "+y);
		x=x+y; //x=30
		y=x-y; //y=30-20=10 
		x=x-y; //x=30-10=20
		System.out.println("After swapping "+x+" "+y);
		
	}
	public static void swap3(int x,int y) {  // if x=10 y=20
		System.out.println("Before Swapping: "+x+" "+y);
		x=x*y; //x=200
		y=x/y; //y=200/20=10
		x=x/y; //x=200/10=20
		System.out.println("After swapping "+x+" "+y);
		
	}

}

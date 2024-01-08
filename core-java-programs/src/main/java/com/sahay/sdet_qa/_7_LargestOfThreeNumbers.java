package com.sahay.sdet_qa;

public class _7_LargestOfThreeNumbers {

	public static void main(String[] args) {
		// Note: two numbers should not be same
       largest(10, 90, 0);
       biggest(1, 5, 4);
	}

	public static void largest(int x,int y, int z) {
		if(x>y && x>z) {
			System.out.println(x+" is greatest");
		}
		if(y>x && y>z) {
			System.out.println(y+" is greatest");
		}else
			System.out.println(z+" is greatest");
	}
	//Using ternary operator
	public static void biggest(int x,int y,int z) {
		int big= x>y?x:y;
		int biggest=big>z? big:z;
		System.out.println(biggest);
	}
}

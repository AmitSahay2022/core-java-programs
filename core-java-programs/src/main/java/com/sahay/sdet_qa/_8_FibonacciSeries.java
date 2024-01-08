package com.sahay.sdet_qa;

public class _8_FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10);   
	}
	public static void fibonacci(int range) {
		if(range<0) {
			System.out.println("__!!@");
			return;
		}
		if(range==1) {
			System.out.print("0");
			return;
		}
		if(range==2) {
			System.out.println("0 1");
			return;
		}
		int first=0;
		int second=1;
		System.out.print("0 1");
		int i=3;
		while(i<=range) {
			int third=first+second;
			System.out.print(" "+third+" ");
			first=second;
			second=third;
			i++;
		}
	}

}

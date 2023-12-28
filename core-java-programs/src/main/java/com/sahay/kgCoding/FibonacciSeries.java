package com.sahay.kgCoding;
/*
 * Print fibonacci series upto given number
 */
public class FibonacciSeries {
	public static void printFibonacci(int range) {
		int first=0,second=1;
		if(range<0) return;
		if(range==0) System.out.print(0);
		
		System.out.print(first+" "+second+" "); 
		while((first+second) < range) {
			int third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
		
	}

	public static void main(String[] args) {
		//printFibonacci(50);
		printFibonacci(200);
	}

}

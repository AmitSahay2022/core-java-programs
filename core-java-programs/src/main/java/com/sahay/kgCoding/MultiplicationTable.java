package com.sahay.kgCoding;

public class MultiplicationTable {
	
	public static void table(int num) {
		int i=1;
		while(i<=10) {
			System.out.println(num+" x "+i+" ="+(num*i));
			i++;
		}
	}

	public static void main(String[] args) {
		table(8);

	}

}

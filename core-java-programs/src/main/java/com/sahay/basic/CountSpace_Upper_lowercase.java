package com.sahay.basic;
/*
 * WAP to input a String and count all whitespace, uppercase, lowercase letters?
 */
public class CountSpace_Upper_lowercase {
	
	//extract each character one by one and compare it's ASCII value
	public static void counter(String line) {
		int lowerCase=0;
		int upperCase=0;
		int space=0;
		for(char c:line.toCharArray()) {
			if(c>=65&&c<=90) {
				upperCase++;
			}
			if(c>=97 && c<=122) {
				lowerCase++;
			}
			if(c==32) {
				space++;
			}
		}
		System.out.println("Total Lower case letters: "+lowerCase);
		System.out.println("Total Upper case letters: "+upperCase);
		System.out.println("Total white space: "+space);
	}

	public static void main(String[] args) {
		counter("Hello Welcome To The World Of Java Programming");
	}

}

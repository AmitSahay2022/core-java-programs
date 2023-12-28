package com.sahay.kgCoding;
/*
 *          *
 *         **
 *        *** 
 *       ****
 */

public class Pattern3 {

	public static void main(String[] args) {
		int n=3;
		for(int i=0;i<4;i++) {
			//One inner loop to print space
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			//Other loop to print *
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			n--;
		}

	}

}

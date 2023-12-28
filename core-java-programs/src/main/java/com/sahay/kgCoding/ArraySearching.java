package com.sahay.kgCoding;

import java.util.Scanner;

/*
 * Linear search 
 */
public class ArraySearching {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int [] numbers= {3,7,4,1,2,15,18,32,46,77};
		System.out.println("Enter a number to search in Array");
        int find=scanner.nextInt();
        for(int x:numbers) {
        	
        	if(x==find) {
        		System.out.println("Found ");
        		return;
        	}
        }
        System.out.println("Not Found!");
	}

}

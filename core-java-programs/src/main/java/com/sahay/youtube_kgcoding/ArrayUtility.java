package com.sahay.youtube_kgcoding;

import java.util.Scanner;

public class ArrayUtility {
	public static int[] inputArray() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many elements you want to enter");
		int size=scanner.nextInt();
		int[] numbers=new int[size];
		int i=0;
		while(i<size) {
			System.out.println("Enter "+(i+1)+" element");
			numbers[i]=scanner.nextInt();
			i++;
		}
		return numbers;
	}

}

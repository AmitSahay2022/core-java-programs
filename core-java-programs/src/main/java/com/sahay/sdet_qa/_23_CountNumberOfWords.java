package com.sahay.sdet_qa;

public class _23_CountNumberOfWords {

	public static void main(String[] args) {
		String message="Welcome to java, And Spring Boot";
		int count=1;
		for(int i=0;i<message.length();i++) {
			if((message.charAt(i)==' ') && (message.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);

	}

}

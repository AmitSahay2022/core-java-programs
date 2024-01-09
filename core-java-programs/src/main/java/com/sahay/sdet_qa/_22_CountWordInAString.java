package com.sahay.sdet_qa;

public class _22_CountWordInAString {

	public static void main(String[] args) {
		String about="My Name is Amit Kumar. I am a java backend developer. I have five years of experence"
				+ "in Java, Spring Boot REST API Development";
		String[] words = about.split(" ");
		System.out.println(words.length);
		String subject="Spring Boot REST API";
		char[] charArray = subject.toCharArray();
		System.out.println(charArray.length);

	}

}

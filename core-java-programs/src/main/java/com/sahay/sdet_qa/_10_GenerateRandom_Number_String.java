package com.sahay.sdet_qa;

import java.util.Random;
import java.util.UUID;

public class _10_GenerateRandom_Number_String {

	public static void main(String[] args) {
		generateInt(6);   
		generateRandomNumber(8);
		System.out.println(generateRandom());
	}
	
	//This method is to generate number between 1-range
	public static void generateInt(int range) {
		int num = (int)Math.ceil(Math.random()*range);
		System.out.println(num);
	}
	
	public static void generateRandomNumber(int range) {
		Random random=new Random();
		int randInt = random.nextInt(10);
		int randIntBetween = random.nextInt(10, 20);
		System.out.println(randInt+" "+randIntBetween);
		
		
	}
	
	public static String generateRandom() {
		 return UUID.randomUUID().toString();
	}
	
	

}

/*
Math.random() returns number between 0.01 to 0.99
Math.ceil() makes round figure

*/
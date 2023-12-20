package com.sahay.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShuffle_QuizAppLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<>();
		fruits.addAll(List.of("Apple","Banana","Orange","Mango","Papaya","Amrud","Nagangi"));
        Collections.shuffle(fruits); 
        int howManyFruitsRequired=3;
        int numOfFruits = Math.min(howManyFruitsRequired, fruits.size());
        List<String> randomFruitsAre = fruits.subList(0, numOfFruits);
        System.out.println("You Got: "+randomFruitsAre);
	}

}

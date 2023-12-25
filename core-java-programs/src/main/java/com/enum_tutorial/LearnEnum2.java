package com.enum_tutorial;

public class LearnEnum2 {

	public static void main(String[] args) {
		Actor actor=Actor.AKSHAY;
		System.out.println(actor.name());
		
		//How to iterate over enum ?
		Actor[] actors = Actor.values();
        for (Actor a : actors) {
			System.out.println(a.name()+" "+a.ordinal()+" "); //ordinal is sequence order of enum objects
			System.out.println(a.description());
		}
	}

}

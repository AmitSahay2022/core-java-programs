package com.sahay.youtube_kgcoding.oops;

public class Car extends Vichele {
	private int tyre;
	private String name;

	public Car(int tyre, String name) {
		super(tyre, name);
	}

	@Override
	public void makeStartSound() {
		System.out.println("Vroommmmmmmmmmmmm");
		
	}
	
	
}

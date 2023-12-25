package com.enum_tutorial;

public class Demo {

	public static void main(String[] args) {
		OrderStatus status=OrderStatus.PAID;
		System.out.println(status);
		if(status==OrderStatus.PAID) {
			System.out.println("You Paid for the order");
		} else if(status==OrderStatus.CANCELLED) {
			System.out.println("You cancelled the order");
		}

	}

}

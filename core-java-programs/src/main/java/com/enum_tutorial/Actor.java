package com.enum_tutorial;

public enum Actor {
	AMITABH("6.4", "Lambu ji", 405), AKSHAY("5,11", "khiladi", 509), SRK("5.9", "what the ..", 1123),
	SALMAN("5.5", "BodyBuilder", 546), GOVINDA("5.6", "Mota", 87);

	private String height;
	private String name;
	private int wealth;

    //Constructor for enum objects
	private Actor(String height, String nickName, int wealth) {
		this.height = height;
		this.name = nickName;
		this.wealth = wealth;
	}

	// Method for each enum objects
	public String description() {
		return height + " " + name + " " + wealth;
	}

}

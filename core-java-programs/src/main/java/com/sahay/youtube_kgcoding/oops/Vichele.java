package com.sahay.youtube_kgcoding.oops;

public abstract class Vichele {
  private int numberOfTyre;
  private String name;
  public Vichele(int tyre,String name) {
	  this.numberOfTyre=tyre;
	  this.name=name;
  }
  public void commute() {
	  System.out.println(name+" is running on "+numberOfTyre+" wheels");
  }
  public abstract void makeStartSound();
}

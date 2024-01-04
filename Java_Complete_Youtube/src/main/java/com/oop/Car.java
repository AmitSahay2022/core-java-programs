package com.oop;

public class Car {
    Colors color;
    String name;
    int numberOfWheels;
    int fuelInLeters;
    static int numberOfCarsSold=0;
    static {
        System.out.println("Car Showroom is open");
    }
    {
        System.out.println("One Car is Created");
        numberOfCarsSold++;
    }
    public Car(){
        this(Colors.WHITE,"Swift");
        this.fuelInLeters=2;
    }
    public Car(Colors colors,String name){
        this.color=colors;
        this.name=name;
        this.fuelInLeters=5;
    }

    public Car start(){
        if(fuelInLeters>0){
            System.out.println(this.name+ " Car is strarted...");
            return this;
        }else{
            System.out.println("Can not start fuel is empty");
        }
        return null;
    }
    public void drive(){
        System.out.println(this.name+" is running....");
        while(fuelInLeters>0) {
            try {
                Thread.sleep(2000);
            }catch(Exception e){}
            fuelInLeters--;
        }
    }
}

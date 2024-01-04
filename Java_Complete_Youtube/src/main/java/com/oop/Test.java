package com.oop;

public class Test {
    public static void main(String[] args) {

        Car car=new Car();
        Car car1=new Car(Colors.RED,"Altroz");

        if(true){
            car.start().drive();
            car1.start().drive();
        }

        System.out.println("Number of Cars sold: "+Car.numberOfCarsSold);

    }
}

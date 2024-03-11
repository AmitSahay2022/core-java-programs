package org.example.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle vehicle=new Car(4,4,"Honda City","VXI");
        vehicle.commute("Patna","Delhi");
    }
}

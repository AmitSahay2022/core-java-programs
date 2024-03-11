package org.example.abstraction;

public abstract class Vehicle implements Transport{
    private int numberOfTyres;

    public Vehicle(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }
    @Override
    public void go(){
        System.out.println("Horn Ok Going....");
    }

    public abstract void commute(String from,String to);
}

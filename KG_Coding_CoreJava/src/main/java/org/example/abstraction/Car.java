package org.example.abstraction;

public class Car extends Vehicle{
    private int numberOfDores;
    private String brand;
    private String modelNo;
    public Car(int numberOfTyres,int numberOfDores,String brand,String modelNo) {
        super(numberOfTyres);
        this.numberOfDores=numberOfDores;
        this.brand=brand;
        this.modelNo=modelNo;
    }

    @Override
    public void commute(String from,String to) {
        System.out.println("My Car "+brand+" "+modelNo+" is moving from "+from+" to "+to);
    }

}

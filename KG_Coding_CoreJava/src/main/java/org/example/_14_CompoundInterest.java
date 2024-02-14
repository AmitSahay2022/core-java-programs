package org.example;

public class _14_CompoundInterest {
    public static void main(String[] args) {
        System.out.println(ci(100,10,2));
    }
    public static double ci(double amt,double rate,int year){
        double interest=amt* Math.pow ((1+rate/100),year);

        return interest-amt;
    }
}

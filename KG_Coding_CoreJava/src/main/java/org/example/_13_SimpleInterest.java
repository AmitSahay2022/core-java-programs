package org.example;

public class _13_SimpleInterest {
    public static void main(String[] args) {
        System.out.println(simpleInterest(100,10,2));
    }
    public static double simpleInterest(double amt,double rate,float year){
        double interest=0;
        interest=(amt*rate)/100 *year;
        return interest;
    }
}

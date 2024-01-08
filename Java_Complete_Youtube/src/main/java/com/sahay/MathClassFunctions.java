package com.sahay;

public class MathClassFunctions {
    public static void main(String[] args) {
        double price=65.764;
        System.out.println(Math.round(price));
        System.out.println(Math.ceil(price));
        System.out.println(Math.floor(price));
        System.out.println(Math.abs(-987));
        System.out.println(Math.pow(2,4)); //2x2x2x2
        System.out.println(Math.sqrt(25)); //5
        System.out.println(Math.max(20,25)); //25
        System.out.println(Math.min(23,34)); //23
        //Generate random between 100
        long random=Math.round(Math.random()*100);
        System.out.println(random);
        System.out.println(Math.round(Math.random()*10));
        System.out.println(Math.PI);

    }
}

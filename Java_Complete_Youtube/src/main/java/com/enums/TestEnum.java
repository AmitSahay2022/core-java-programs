package com.enums;

public class TestEnum {
    public static void main(String[] args) {
        TraficLight light=TraficLight.GREEN;
        System.out.println(light);
        //String to enum
        TraficLight light1=TraficLight.valueOf("RED");
        System.out.println(light1);
        //Iterate and get all available enum objects
        for(TraficLight l:TraficLight.values()){
            System.out.println(l);
        }
    }
}

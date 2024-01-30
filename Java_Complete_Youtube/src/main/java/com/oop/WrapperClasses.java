package com.oop;

public class WrapperClasses {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        Integer c=5;
        Integer d=Integer.valueOf(5);
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a==c);
    }
}

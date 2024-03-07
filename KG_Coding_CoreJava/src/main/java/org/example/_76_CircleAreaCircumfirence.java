package org.example;

public class _76_CircleAreaCircumfirence {
    public static void main(String[] args) {
        System.out.println(circumfirence(5));
        System.out.println(area(5));
    }

    public static double circumfirence(double radius){
        return 2*Math.PI*radius;
    }
    public static double area(double radius){
//        Math.PI * Math.pow(radius,2)  //both are same
        return Math.PI*radius*radius;
    }
}

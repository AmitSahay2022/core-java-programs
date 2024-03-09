package org.example.utils;

import org.example.geometry.Circle;
import org.example.geometry.Rectangle;

public class Calculator {
    public static void main(String... a){
        Circle circle=new Circle(5);
        Rectangle rectangle=new Rectangle(5,6);
        calculateRectangleArea(rectangle);
        calculateArea(circle);
    }
    public static void calculateRectangleArea(Rectangle rectangle){
        System.out.println(rectangle.getLength()*rectangle.getBredth());
    }
    public static void calculateArea(Circle circle){
        System.out.println(Math.PI*Math.pow(circle.getRadius(),2));
    }
}

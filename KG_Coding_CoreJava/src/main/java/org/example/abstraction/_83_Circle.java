package org.example.abstraction;

public class _83_Circle extends _83_Shape{
    private double radius;

    public _83_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        System.out.println(Math.PI * Math.pow(radius,2));
        return Math.PI * Math.pow(radius,2);
    }
}

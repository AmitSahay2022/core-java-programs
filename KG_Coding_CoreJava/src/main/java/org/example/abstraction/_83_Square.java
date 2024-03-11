package org.example.abstraction;

public class _83_Square extends _83_Shape{
    private double side;

    public _83_Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        System.out.println(side*side);
        return side*side;
    }
}

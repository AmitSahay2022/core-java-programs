package org.example.abstraction;


public class _83_Test {
    public static void main(String[] args) {
        _83_Shape shape1=new _83_Circle(5);
        shape1.calculateArea();
        _83_Shape shape2=new _83_Square(5);
        shape2.calculateArea();
    }
}

package org.example.abstraction;

public class _84_Eagle extends _84_Bird{
    public _84_Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying high...");
    }

    public static void main(String[] args) {
        _84_Flyable eagle=new _84_Eagle();
        eagle.fly();
    }
}

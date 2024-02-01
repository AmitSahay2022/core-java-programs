package com.multithreading;

public class Test {
    public static void main(String[] args) {
        PrintTask task1=new PrintTask('*');
        PrintTask task2=new PrintTask('$');
        task1.start();
        task2.start();
    }
}

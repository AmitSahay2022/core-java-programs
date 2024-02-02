package com.sahay;

public class VarArgDemo {
    public static int addAnyNumberOfIntegers(int...args){
        int sum=0;
        for(int x:args){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = addAnyNumberOfIntegers(5, 7, 2, 3, 4, 9);
        System.out.println(sum);
    }
}

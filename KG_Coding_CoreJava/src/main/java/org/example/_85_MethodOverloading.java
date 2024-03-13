package org.example;

import java.util.Arrays;

public class _85_MethodOverloading {
    //--------------------------------------------
    private class Calculator{
        //add two number
        public int add(int a,int b){
            int sum=a+b;
            System.out.println("Sum is: "+sum);
            return sum;
        }
        //add multiple numbers
        public double add(double... nums){
            double total=0;
            total=Arrays.stream(nums).sum();
            System.out.println("Sum of numbers = "+total);
            return total;
        }
    }
    //----------------------------------------------
    public static void main(String[] args) {
        _85_MethodOverloading overloading=new _85_MethodOverloading();
        Calculator calculator=overloading.new Calculator();
        calculator.add(5,10);
        calculator.add(4,6,2,3,9,7,8,5);
    }
}

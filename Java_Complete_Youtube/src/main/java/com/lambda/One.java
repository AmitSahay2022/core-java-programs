package com.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class One {
    public static void main(String[] args) {
        //Lambda to take two integer and return there multiplication
        BiFunction<Integer,Integer,Integer> multiplication=(a,b)->a*b;
        System.out.println(multiplication.apply(5,7));
        System.out.println("---------------------------------------");
        BinaryOperator<Integer> mul=(x,y)->x*y;
        System.out.println(mul.apply(8,9));
    }
}

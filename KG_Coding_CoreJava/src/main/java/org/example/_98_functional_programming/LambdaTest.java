package org.example._98_functional_programming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaTest {
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        //With Lambda and functional interface
        BiFunction<Integer,Integer,Integer> sumWithLambda=(x,a)->x+a;
        System.out.println(sumWithLambda.apply(10,18));
        //Function to print String with modification
        Function<String ,String> print=s->s+" @"+"microsoft.com";
        System.out.println(print.apply("Amit Sahay"));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}

package org.example._98_functional_programming;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        //Program to concatinate two String
        BiFunction<String,String,String> concat=(s1,s2)->{
          StringBuilder builder=new StringBuilder();
          builder.append(s1);
          builder.append("->");
          builder.append(s2);
          return builder.toString();
        };
        System.out.println(concat.apply("Java","Python"));
    }
}

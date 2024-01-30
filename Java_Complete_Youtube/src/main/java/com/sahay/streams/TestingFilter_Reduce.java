package com.sahay.streams;

import java.util.Arrays;
import java.util.List;

public class TestingFilter_Reduce {
    public static void main(String[] args) {
        List<String> fruits= List.of("Apple","Banana","Dates","Mango","PineApple");
        fruits.stream().map(f-> f.toUpperCase()).forEach(i-> System.out.println(i));
        System.out.println("------------------------------");
        //print only those which ends with e
        fruits.stream().filter(f->f.endsWith("e")).forEach(i-> System.out.println(i));
        List<Integer> numbers= Arrays.asList(5,3,7,9,1,2,8);
        Integer total = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(total);
    }
}

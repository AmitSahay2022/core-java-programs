package com.lambda;

import java.util.stream.IntStream;

public class Factorial_FunctionalApproach {
    public static void main(String[] args) {
        int facto = IntStream.rangeClosed(2, 6).reduce(1, (a, b) -> a * b);
        System.out.println(facto);
    }
}

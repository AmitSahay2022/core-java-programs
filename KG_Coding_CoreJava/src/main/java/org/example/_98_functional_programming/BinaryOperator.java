package org.example._98_functional_programming;

public class BinaryOperator {
    public static void main(String[] args) {
        java.util.function.BinaryOperator<Integer> mul=(a, b)-> {
            return a * b;
        };
        System.out.println(mul.apply(5,7));
    }
    //Bifunction vs BinaryOperator?
}

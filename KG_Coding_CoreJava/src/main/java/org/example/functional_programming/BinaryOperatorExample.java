package org.example.functional_programming;

import java.util.function.BinaryOperator;

/*
The BinaryOperator<T> interface extends BiFunction<T, T, T>
and represents an operation upon two operands of the same type,
 producing a result of the same type as the operands.
It inherits the apply(T t, T u) method from BiFunction.
 */
public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> add=(a,b)->a+b;
        System.out.println(add.apply(10,15));
    }
}

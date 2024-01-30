package com.lambda;

import java.util.List;

public class FindOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().filter(n->n%2 !=0).forEach(n-> System.out.println(n));
    }
}

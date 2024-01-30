package com.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalDemoWithReduce {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5,6,7,8,9);
        Optional<Integer> total = nums.stream().reduce((x, y) -> x + y);
        Integer sum = total.orElse(0);
        System.out.println(sum);
    }
}

package com.stream;

import java.util.Arrays;
import java.util.List;

public class _1_CountNumberOfEven {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,10,15,20,25);
        long count = nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);

    }
}

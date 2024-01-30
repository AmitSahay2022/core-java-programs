package com.sahay.streams;

import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,5,3,9,1,6,55,8,0);
        Integer max = nums.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);
        Integer min = nums.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.println(min);
    }
}

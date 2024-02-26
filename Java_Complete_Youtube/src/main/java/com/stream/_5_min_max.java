package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _5_min_max {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(8,1,4,2,9,7);
        Integer min = nums.stream().min(Comparator.comparing(Integer::intValue)).get();
        System.out.println(min);
        Integer max = nums.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println(max);
    }

}

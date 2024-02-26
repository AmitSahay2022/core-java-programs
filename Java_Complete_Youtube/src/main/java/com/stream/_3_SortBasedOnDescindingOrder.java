package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _3_SortBasedOnDescindingOrder {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,7,8,2,4,1,9,10);
        List<Integer> sortedNums = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNums);
    }
}

package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _5_SecondHighestInArray {
    public static void main(String[] args) {
        int[] nums={5,7,2,4,1,9};
        Integer secondHighest = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);
    }
}

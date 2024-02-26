package com.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4_SortBasedOnTheLengthOfString {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Apple","Cat","Dog","Bhalu","Elephant","Batista");
        List<String> sortedBasedOnLength = words.stream().sorted((w1, w2) -> w1.length() - w2.length()).collect(Collectors.toList());
        System.out.println(sortedBasedOnLength);
    }
}

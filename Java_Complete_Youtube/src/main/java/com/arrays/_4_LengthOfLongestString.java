package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4_LengthOfLongestString {
    public static void main(String[] args) {
        String [] fruits={"Apple","Banana","Avocado","Apricot","Grapes"};
        List<String> sortedByLength = Arrays.stream(fruits).sorted(Comparator.comparing(f -> f.length())).collect(Collectors.toList());
        System.out.println(sortedByLength.get(sortedByLength.size()-1));
    }
}

package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _1_OccurenceOf_Char_InString {
    public static void main(String[] args) {
        String name="Amit Loves Amanda Sunny Disha Patani";
        String[] split = name.split("");
        System.out.println(Arrays.toString(split));
        Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(collect);
    }
}

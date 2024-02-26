package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _8_Map {
    public static void main(String[] args) {
        List<Integer> weight= Arrays.asList(295,305,500,350,175,251,220,325,340);
        List<String> weightInlbs = weight.stream().map(i -> i + " lbs").collect(Collectors.toList());
        System.out.println(weightInlbs);
    }
}

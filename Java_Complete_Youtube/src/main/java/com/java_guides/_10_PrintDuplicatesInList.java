package com.java_guides;

import java.util.*;
import java.util.stream.Collectors;

public class _10_PrintDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,7,8,5,8,9,5);
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(collect);
        collect.entrySet().stream().filter(e->e.getValue()>1).forEach(i-> System.out.println(i.getKey()));
    }

}

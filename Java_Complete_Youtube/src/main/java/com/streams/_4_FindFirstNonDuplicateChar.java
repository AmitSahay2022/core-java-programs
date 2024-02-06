package com.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class _4_FindFirstNonDuplicateChar {
    public static void main(String[] args) {
        String name="Amit Loves Amanda Sunny Disha Patani";//"Amit Loves Amanda Cerny Sunny Leone Disha Patani";
        String firstNonDuplicateChar = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(c -> c.getKey())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Oops!"));
        System.out.println(firstNonDuplicateChar);
    }
}

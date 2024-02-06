package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_FindDuplicateElementsInString {
    public static void main(String[] args) {
        String word="ILoveJavaCodingWithJavaTechie";
        List<String> duplicateChar = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(c -> c.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicateChar);
    }
}

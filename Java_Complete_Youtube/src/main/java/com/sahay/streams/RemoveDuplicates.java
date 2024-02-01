package com.sahay.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Banana","Apple");
        List<String> phal = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(phal);
    }
}

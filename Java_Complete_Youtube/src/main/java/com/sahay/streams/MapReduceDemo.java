package com.sahay.streams;

import java.util.List;
import java.util.Optional;

public class MapReduceDemo {
    public static void main(String[] args) {
        List<String> numbers= List.of("2","3","4","5");
        numbers.stream()
                .map(n -> Integer.parseInt(n))
                .map(n->Math.pow(n,2)).reduce((x, y) -> x + y).ifPresent(System.out::println);

    }
}

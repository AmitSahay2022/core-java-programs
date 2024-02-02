package com.sahay;

import java.util.Comparator;
import java.util.List;

public class _90_SortListOfStringInDescendingOrder {
    public static void main(String[] args) {
        List<String> names= List.of("Sania","Sunny","Katrina","Amit","Amanda","Disha");
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

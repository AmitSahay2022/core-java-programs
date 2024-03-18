package org.example._100_sort_distinct_map;

import java.util.List;

public class _2_PrintOnly_Unique {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,2,5,2,7,3,5);
        list.stream().distinct().forEach(System.out::println);
    }
}

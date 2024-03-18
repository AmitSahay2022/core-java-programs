package org.example._100_sort_distinct_map;

import java.util.List;
import java.util.stream.Collectors;

public class _1_Sort_Integer_List {
    public static void main(String[] args) {
        List<Integer> list=List.of(4,2,6,7,1,9,3);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}

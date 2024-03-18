package org.example._100_sort_distinct_map;

import java.util.List;

public class _3_MapDemo {
    public static void main(String[] args) {
        List<Integer> list=List.of(3,4,5,2,8);
        //squire of each element
        list.stream().map(n->n*n).forEach(n-> System.out.print(n+" "));
    }
}

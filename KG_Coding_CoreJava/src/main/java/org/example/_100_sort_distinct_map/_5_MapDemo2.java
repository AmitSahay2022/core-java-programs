package org.example._100_sort_distinct_map;

import java.util.Arrays;
import java.util.List;

public class _5_MapDemo2 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("1","2","5","4","3","9");
        //String -> integer ->squire -> sum all
        Integer sumOfAllSqu = list.stream().map(o -> Integer.parseInt(o)).map(n -> n * n).reduce(0, (n1, n2) -> n1 + n2);
        System.out.println(sumOfAllSqu);
    }
}

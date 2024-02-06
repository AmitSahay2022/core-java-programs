package com.streams;

import java.util.Arrays;

public class _7_FindNumberStartsWith1 {
    public static void main(String[] args) {
        int[] nums={2,4,1,7,8,11,21,34};
        Arrays.stream(nums)
                .boxed()
                .map(n->n+"")
                .filter(n->n.startsWith("1"))
                .forEach(System.out::println);
    }
}

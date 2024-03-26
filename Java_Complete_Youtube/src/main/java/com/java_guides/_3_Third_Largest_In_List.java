package com.java_guides;

import java.util.Comparator;
import java.util.List;

public class _3_Third_Largest_In_List {
    public static void main(String[] args) {
        List<Integer> nums=List.of(4,8,9,1,2,7);
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst().ifPresent(n-> System.out.println("Third Largest = "+n));
    }
}

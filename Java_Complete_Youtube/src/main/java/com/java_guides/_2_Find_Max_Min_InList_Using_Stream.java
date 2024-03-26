package com.java_guides;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class _2_Find_Max_Min_InList_Using_Stream {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(3,4,5,2,1,8,9,5,7);
        Optional<Integer> max = nums.stream().max(Comparator.naturalOrder());
        Optional<Integer> min = nums.stream().min(Comparator.naturalOrder());
        System.out.println("Maximum= "+max);
        System.out.println("Minimum= "+min);
    }
}

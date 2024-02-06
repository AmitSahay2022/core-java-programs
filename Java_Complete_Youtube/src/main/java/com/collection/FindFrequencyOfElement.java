package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFrequencyOfElement {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(5,6,2,7,5,4,2,8,9,2);
        System.out.println(Collections.frequency(nums,5));
    }
}

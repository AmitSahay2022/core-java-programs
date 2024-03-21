package com.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class _1_FindSecondLargest {
    public static void main(String[] args) {
        Integer[] nums={5,2,8,3,1};
        Optional<Integer> secondLargest = Arrays.stream(nums).sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(secondLargest.isPresent()){
            System.out.println(secondLargest.get());
        }
        //Find second smallest
        Optional<Integer> secondSmallest = Arrays.stream(nums).sorted().skip(1).findFirst();
        System.out.println(secondSmallest.get());
        //What if there are duplicate
        //distinct()
    }
}

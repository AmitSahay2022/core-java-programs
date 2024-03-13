package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _88_Count_FrequencyOfElement {
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(2,9,8,5,9,7,8,1,4,5,2);
        frequency(integers,2);
        //-------------------
        int frequencyOf5 = Collections.frequency(integers, 5);
        System.out.println(frequencyOf5);
    }
    public static void frequency(List<Integer> nums,int n){
        int count=0;
        for(Integer i:nums){
            if(i==n)
                count++;
        }
        System.out.println(n+" Occurred "+count+" times");
    }
}

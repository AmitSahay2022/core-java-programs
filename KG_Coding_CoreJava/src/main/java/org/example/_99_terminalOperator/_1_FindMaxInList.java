package org.example._99_terminalOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class _1_FindMaxInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,3,1,6,7,4,9,8,5,1);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        if(max.isPresent()){
            System.out.println(max.get());
        }
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        if(min.isPresent())
            System.out.println(min.get());
    }
}

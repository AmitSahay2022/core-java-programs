package org.example._99_terminalOperator;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _2_FindEvenNumbersAndStoreItInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8,9);
        //Collect only even numbers and store it in different list
        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}

package org.example._98_functional_programming;

import java.util.Arrays;
import java.util.List;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,5,6,7,8,9);
        num.stream().filter(n->n%2==1).forEach(n-> System.out.println(n));
    }
}

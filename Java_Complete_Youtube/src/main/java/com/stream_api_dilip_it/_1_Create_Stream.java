package com.stream_api_dilip_it;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _1_Create_Stream {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 5, 7, 3, 4, 9, 6);
        //1. From Collection object
        List<Integer> listOfOdds = integerList.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
        System.out.println(listOfOdds);

        //2. from Array object
        int[] arr={4,5,3,8,9,7,6,5};
        Arrays.stream(arr).average().ifPresent(System.out::println);

        //3. using Stream.of(any collection)
        Stream.of(4,3,2,5,6,7,8).filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
    }
}

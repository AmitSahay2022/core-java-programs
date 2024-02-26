package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _7_ArrayToStream {
    public static void main(String[] args) {
        String[] names={"Ram","Shyam","Radha","Krishna","Shiva","Amit","Parvati"};
        Arrays.stream(names).forEach(System.out::println);
        //Or use stream.of() to convert any collection of objects (array,List etc.)
        List<String> list = Stream.of(names).sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}

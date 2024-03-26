package com.java_guides;

import java.util.List;

public class _7_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integers=List.of(2,3,4,4,5,2,5,6,7,8,8);
        integers.stream().distinct().forEach(n-> System.out.print(n+" "));
    }
}

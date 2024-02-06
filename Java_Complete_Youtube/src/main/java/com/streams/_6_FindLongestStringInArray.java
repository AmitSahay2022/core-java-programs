package com.streams;

import java.util.Arrays;

public class _6_FindLongestStringInArray {
    public static void main(String[] args) {
        String [] words={"java","techie","springboot","microservices"};
        String longest = Arrays.stream(words).sorted((c1, c2) -> c2.length() - c1.length()).findFirst().get();
        System.out.println(longest);
    }
}

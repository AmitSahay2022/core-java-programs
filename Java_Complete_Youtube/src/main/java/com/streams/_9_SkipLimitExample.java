package com.streams;

import java.util.stream.IntStream;

public class _9_SkipLimitExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        intStream.skip(1).limit(4).forEach(n-> System.out.println(n));
    }
}

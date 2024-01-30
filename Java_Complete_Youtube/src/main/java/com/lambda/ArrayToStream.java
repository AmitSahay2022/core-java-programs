package com.lambda;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {
        String [] names={"Sunny Leone","Amanda Cerny","Katrina kaif"};
        Arrays.asList(names).stream().forEach(System.out::println);
    }
}

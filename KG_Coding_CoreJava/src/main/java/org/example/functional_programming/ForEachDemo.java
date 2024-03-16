package org.example.functional_programming;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String > fruits= Arrays.asList("Banana","mango","Dates","Apple","Orange");
        System.out.println(fruits.size());
        fruits.forEach((f)-> System.out.println(f));
        System.out.println("----------------------------------------------");
        //? Print only those fruits which ends with e
        fruits.stream().filter(f->f.endsWith("e")).forEach(f-> System.out.println(f));
    }
}

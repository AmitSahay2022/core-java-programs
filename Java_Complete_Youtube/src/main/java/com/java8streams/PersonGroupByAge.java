package com.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonGroupByAge {
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(new Person("Brock","Minisotta",46),
                new Person("Brock","Minisotta",46),
                new Person("Rock","NYC",42),
                new Person("Cena","UK",42),
                new Person("RVD","Minisotta",46),
                new Person("Undertaker","Minisotta",48),
                new Person("Kane","KR",48),
                new Person("Batista","ni",41)
                );
        //Group by age
        Map<Integer, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(collect);
    }
}

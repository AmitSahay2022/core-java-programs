package com.stream_api_dilip_it;

import java.util.Comparator;
import java.util.stream.Collectors;

public class _22_findMax_Id_Of_employees {
    public static void main(String[] args) {
        ListOfEmployee
                .employees()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getId)))
                .ifPresent(System.out::println);
        //--------Or Else---------
        ListOfEmployee
                .employees()
                .stream()
                .max(Comparator.comparing(Employee::getId))
                .ifPresent(System.out::println);
    }
}

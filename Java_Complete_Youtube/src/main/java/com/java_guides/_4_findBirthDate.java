package com.java_guides;

import java.time.LocalDate;
import java.time.Period;

public class _4_findBirthDate {
    public static void main(String[] args) {
        LocalDate birthDate=LocalDate.parse("1987-10-27");
        LocalDate currentDate=LocalDate.now();
        Period between = Period.between(birthDate, currentDate);
        System.out.println(between.getYears());
    }
}

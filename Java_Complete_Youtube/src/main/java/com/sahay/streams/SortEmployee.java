package com.sahay.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> employees=List.of(new Employee("Amit",64329),
                new Employee("Sumit",309876),
                new Employee("Brock",87653),
                new Employee("Anjali",549870)
                );
        List<Employee> sortedEmp = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortedEmp);
    }
}

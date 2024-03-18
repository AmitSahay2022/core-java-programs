package org.example._100_sort_distinct_map;

import java.util.List;

public class ListOfEmployees {
    public static List<Employee> employees(){
        List<Employee> employees=List.of(new Employee("Vijay",89435),
                new Employee("Ram",100000),
                new Employee("Amit",50000),
                new Employee("Sumit",400000),
                new Employee("Sita",800000)
                );
        return employees;
    }
}

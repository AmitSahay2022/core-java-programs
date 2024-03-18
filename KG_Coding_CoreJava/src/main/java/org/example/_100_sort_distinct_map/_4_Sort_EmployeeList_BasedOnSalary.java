package org.example._100_sort_distinct_map;

import java.util.Comparator;
import java.util.List;

public class _4_Sort_EmployeeList_BasedOnSalary {
    public static void main(String[] args) {
        List<Employee> employees = ListOfEmployees.employees();
        employees.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).forEach(e-> System.out.println(e));
    }
}

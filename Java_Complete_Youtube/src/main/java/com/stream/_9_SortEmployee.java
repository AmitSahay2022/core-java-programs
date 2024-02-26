package com.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _9_SortEmployee {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Date date1 = dateFormat.parse("19-01-2024");
        Date date2 = dateFormat.parse("22-02-2024");
        Employee employee1=new Employee("Raja",40000,date1,"Male");
        Employee employee2=new Employee("Ram",50000,date2,"Male");
        Employee employee3=new Employee("Sita",35000,date1,"Fem");
        Employee employee4=new Employee("Mahesh",20000,date2,"Male");
        Employee employee5=new Employee("Vishnu",45000,date1,"Male");
        List<Employee> emplist= Arrays.asList(employee1,employee2,employee3,employee4,employee5);
        //Find Max salary emp
        Employee maxSalaryEmp = emplist.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(maxSalaryEmp);
        System.out.println("------------------------------------------");
        //Sort Emp based on salary
        emplist.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(e-> System.out.println(e));
        System.out.println("--------Emp with 3rd highest salary-----------");
        Employee employee3rd = emplist.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(2).findFirst().get();
        System.out.println(employee3rd);
        //Count male
        Map<String, Long> EmpBasedOnGender = emplist.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(EmpBasedOnGender);
    }
}

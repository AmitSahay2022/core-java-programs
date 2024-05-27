package com.stream_api_dilip_it;

import java.util.Arrays;
import java.util.List;

public class ListOfEmployee {
    public static List<Employee> employees(){
        List<Employee> employees=Arrays.asList(
                new Employee("101","Amit","Shemale","CSE","Patna",20,25980,Arrays.asList("947272","957272")),
                new Employee("130","Sumit","male","Management","Delhi",59,35643,Arrays.asList("947272","957272")),
                new Employee("151","Katrina","Shemale","CSE","Mumbai",90,42000,Arrays.asList("947272","957272")),
                new Employee("121","Vijay","male","Macanical","Gaya",40,23005,Arrays.asList("947272","957272")),
                new Employee("111","Arjun","male","CSE","Ranchi",28,19890,Arrays.asList("947272","957272")),
                new Employee("102","Karan","male","Management","Mumbai",24,13987,Arrays.asList("957272","937272")),
                new Employee("109","Sunny Leone","female","CSE","Mumbai",2,25900,Arrays.asList("947272","957272")),
                new Employee("103","Leah Gotti","female","Management","Delhi",65,15670,Arrays.asList("947272","957272")),
                new Employee("106","Amanda Cerny","female","CSE","Patna",25,12900,Arrays.asList("947272","957272")),
                new Employee("108","Rock","male","Management","Patna",15,49000,Arrays.asList("747270","357279")),
                new Employee("113","John cena","male","Management","Patna",19,39000,Arrays.asList("747270","357279")),
                new Employee("115","VicaTs","Shemale","CSE","Patna",5,19000,Arrays.asList("747270","357279"))
        );
        return employees;
    }
}

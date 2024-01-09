package com.streamAPI;

import java.util.Arrays;
import java.util.List;

public class ListOfStudents {
    public List<Student> students(){
        List<Student> students=Arrays.asList(
                new Student("101","Amit","male","CSE","Patna",20,Arrays.asList("947272","957272")),
                new Student("130","Sumit","male","Management","Delhi",59,Arrays.asList("947272","957272")),
                new Student("151","Katrina","female","CSE","Mumbai",230,Arrays.asList("947272","957272")),
                new Student("121","Vijay","male","Macanical","Gaya",400,Arrays.asList("947272","957272")),
                new Student("111","Arjun","male","CSE","Ranchi",280,Arrays.asList("947272","957272")),
                new Student("101","Karan","male","Management","Machenical",24,Arrays.asList("957272","937272")),
                new Student("109","Sunny Leone","female","CSE","Mumbai",2,Arrays.asList("947272","957272")),
                new Student("103","Leah Gotti","female","Management","Delhi",65,Arrays.asList("947272","957272")),
                new Student("106","Amanda Cerny","female","CSE","Patna",200,Arrays.asList("947272","957272")),
                new Student("108","Rock Bottom","Shemale","Management","Patna",150,Arrays.asList("747270","357279"))
        );
        return students;
    }
}

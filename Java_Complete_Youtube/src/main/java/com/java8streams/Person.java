package com.java8streams;

public class Person {
    private String name;
    private String city;
    private int age;

    public Person(String name, String city,int age) {
        this.name = name;
        this.city = city;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name+" : "+city+" : "+age;
    }
}

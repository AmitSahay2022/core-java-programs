package com.stream_api_dilip_it;

import java.util.List;
import java.util.Objects;

public class Employee {
    private String id;
    private String name;
    private String gender;
    private String dept;
    private String city;
    private Integer rank;

    private int salary;
    private List<String> contacts;

    public Employee(String id, String name, String gender, String dept, String city, Integer rank, int salary, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee student)) return false;
        return rank == student.rank && id.equals(student.id) && name.equals(student.name) && gender.equals(student.gender) && dept.equals(student.dept) && city.equals(student.city) && Objects.equals(contacts, student.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, dept, city, rank, contacts);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                ", contacts=" + contacts +
                '}';
    }
}

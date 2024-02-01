package com.java8.streams;

import java.util.List;
import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private String city;
	private int rank;
	private List<String> contacts;

	public Student(int id, String name, int age, String gender, String dept, String city, int rank,
			List<String> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDept() {
		return dept;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public List<String> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, city, contacts, dept, gender, id, name, rank);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(contacts, other.contacts)
				&& Objects.equals(dept, other.dept) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name) && rank == other.rank;
	}
	
	

}

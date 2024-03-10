package org.example.inheritance;

public class Test {
    public static void main(String[] args) {
        Person person1=new Programmer("45623","Amit kumar","Male","infosis");
        Person person2=new Dancer("32345","Disha","Female","visia");
        Person person3=new Programmer("45623","Amit kumar","Male","infosis");
        person1.walk();
        person1.breathing();
        System.out.println(person1.getAadhar());
        person1.getDetails();
        System.out.println(person1.equals(person3));
        System.out.println(person2.hashCode());
    }
}

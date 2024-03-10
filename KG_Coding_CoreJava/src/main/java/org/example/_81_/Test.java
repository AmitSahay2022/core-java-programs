package org.example._81_;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person("Ganguly",48);
        Person person2=new Person("Ganguly",48);
        Person person3=new Person("Sachin",49);
        Person person4=new Person("Rahul",49);
        if(person1.equals(person2)){
            System.out.println("both are equals");
        }
        System.out.println(person3.hashCode());
    }
}

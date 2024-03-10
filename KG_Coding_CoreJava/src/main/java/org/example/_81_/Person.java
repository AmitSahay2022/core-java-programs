package org.example._81_;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode(){
        return age;
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass().equals(this.getClass())){
            Person person=(Person) o;
            if(this.name.equals(person.name) && this.age==person.age){
                return true;
            }
        }
        return false;
    }
}

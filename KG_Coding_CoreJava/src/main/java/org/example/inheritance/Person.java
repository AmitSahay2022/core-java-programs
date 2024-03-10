package org.example.inheritance;

import java.util.Objects;

public abstract class Person {
    private String aadhar;
    private String name;
    private String gender;

    public String getAadhar() {
        return aadhar;
    }
    public void getDetails(){
        System.out.println(name+" : "+gender+" : "+aadhar);
    }
    public Person(String aadhar,String name,String gender){
        this.aadhar=aadhar;
        this.name=name;
        this.gender=gender;
    }

    public abstract String learn(String subect);
    public abstract String sleep();
    public abstract void walk();

    public void breathing(){
        System.out.println("I am inhaling air");
    }
    //-------------equals and hashcode-----------
    @Override
    public boolean equals(Object o){
        if(o.getClass().equals(this.getClass())){
            Person person=(Person) o;
            if(person.aadhar.equals(this.aadhar) &&
                    person.name.equals(this.name) &&
                    person.gender.equals(this.gender))
                return true;
        }
        return false;
    }
    //---equals method is time taking and costly. hence hashcode method is used. if hashcode is same
             //than equals method is used
    @Override
    public int hashCode() {
        return Objects.hash(aadhar);
    }
}

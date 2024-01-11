package com.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Employee {
    private final int id;
    private final String name;
    private final List<String> contactNumbers;

    public Employee(int id,String name,List<String> contactNumbers){
        this.id=id;
        this.name=name;
        List<String> list=new ArrayList<>(); //This class will not point to external/user provided
        for(String s:contactNumbers){        //list but a new list will copy that items
            list.add(s);
        }
        this.contactNumbers=list;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<String> getContactNumbers(){
        List<String> list=new ArrayList<>();  //We are not returning actual list but it's copy
        for(String s:contactNumbers){
            list.add(s);
        }
        return list;
    }
    public String toString(){
        return "id: "+id+" name: "+name+" "+"contacts: "+contactNumbers;
    }
}

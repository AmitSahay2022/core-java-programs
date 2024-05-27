package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGenerator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");list.add("B");list.add("C");list.add("D");list.add("E");list.add("F");
        list.add("1");list.add("5");list.add("9");list.add("8");list.add("6");list.add("4");
        Collections.shuffle(list);
        System.out.println(list);
        //Generate 5 length password from list elements
        StringBuilder password=new StringBuilder();
        for(int i=0;i<5;i++){
            password.append(list.get(i));
        }
        System.out.println(password);
    }
}

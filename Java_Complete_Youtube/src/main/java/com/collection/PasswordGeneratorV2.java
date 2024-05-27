package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Generate 8 digit password which should have atleast one special char,one number
 */
public class PasswordGeneratorV2 {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("A","a","B","b","C","c","D","d","E","e");
        List<String> list2=Arrays.asList("1","2","3","4","5","6","7","8","9","0");
        List<String> list3=Arrays.asList("!","@","#","$","&","~","(",")","{","}");
        Collections.shuffle(list1);
        Collections.shuffle(list2);
        Collections.shuffle(list3);
        StringBuilder password=new StringBuilder();
        for(int i=0;i<6;i++){
            password.append(list1.get(i));
        }
        password.append(list2.get(0));
        password.append(list3.get(0));

        System.out.println("Password is: "+password);
    }
}

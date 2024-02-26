package com.stream;

import java.util.Arrays;
import java.util.List;

public class _6_List_Stream_Array {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Shyam","Radha","Krishna","Shiva","Amit","Parvati");
        //Sort this list and convert it into Array
        Object[] objects = names.stream().sorted().toArray();
        for(Object o:objects){
            System.out.println((String) o);
        }
    }
}

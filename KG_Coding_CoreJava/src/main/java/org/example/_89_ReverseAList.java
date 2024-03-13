package org.example;

import java.util.Arrays;
import java.util.List;

public class _89_ReverseAList {
    public static void reverse(List<String> list){
        for(int i=0;i<list.size()/2;i++){
            String temp= list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i,temp );
        }
    }
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Ram","Sita","Lakshman","Bharath","Hanuman","Satruhan");
        reverse(names);
        System.out.println(names);
    }
}




/*
We use list.size() - 1 - i to correctly access the elements at the opposite end of the list for swapping.
We subtract 1 from list.size() because list indices are zero-based in Java, so the last element is at index list.size() - 1.
We subtract i because we're iterating from the beginning and end of the list simultaneously.
 */
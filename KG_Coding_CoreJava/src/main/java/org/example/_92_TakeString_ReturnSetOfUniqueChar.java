package org.example;

import java.util.HashSet;
import java.util.Set;

public class _92_TakeString_ReturnSetOfUniqueChar {
    public static Set<Character> uniqueChar(String line){
        Set<Character> set=new HashSet<>();
        for(Character c:line.toCharArray()){
            set.add(c);
        }
        System.out.println(set);
        return set;
    }
    public static void main(String[] args) {
        uniqueChar("bbdccaabe");
    }
}

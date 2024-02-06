package com.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToUniqueChar {
    public static void main(String[] args) {
        ;
        System.out.println(uniqueChar("aaabcdaaaccb"));
    }
   public static Set<Character> uniqueChar(String s){
        Set<Character> charSet=new HashSet<>();
       char[] chars = s.toCharArray();
       for (char c:chars){
           charSet.add(c);
       }
       return charSet;
   }
}

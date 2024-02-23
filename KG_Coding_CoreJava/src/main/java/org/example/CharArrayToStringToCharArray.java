package org.example;

import java.util.Arrays;

public class CharArrayToStringToCharArray {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d'};
        String str=new String(ch);
        System.out.println(str);
        //String to char array
        String s="Batista";
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        //again char[] to String
        System.out.println(new String(chars));
    }
}

package com.java_guides;

import java.util.HashMap;
import java.util.Map;

public class _1_Find_Frequency2 {
    public static void main(String[] args) {
        String str="Katrina Kaif Disha Patani Sunny Leone";
        System.out.println(frequencyFinder(str));
    }
    public static Map<Character,Integer> frequencyFinder(String str){
        Map<Character,Integer> map=new HashMap<>();
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            int occurance=0;
            char ch=chars[i];
            for (char c:chars) {
                if(ch==c)
                    occurance++;
            }
            map.put(ch,occurance);
        }
        return map;
    }
}

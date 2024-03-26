package com.java_guides;

import java.util.Arrays;

public class _1_Find_Frequency_Of_Each_Character_inString {
    public static void main(String[] args) {
        String str="Katrina Kaif Sunny Leone";
        char[] chars=str.toCharArray();
        for (char c:chars){
            System.out.println(frequencyFinder(c,str));
        }
    }
    public static CustomReturn frequencyFinder(char c,String str){
        int time=0;
        char[] carr=str.toCharArray();
        for(char ch:carr){
            if(c==ch)
                time++;
        }

        return new CustomReturn(time,c);
    }
    public static class CustomReturn{
        int time;
        char character;

        public CustomReturn(int time, char character) {
            this.time = time;
            this.character = character;
        }

        public int getTime() {
            return time;
        }

        public char getCharacter() {
            return character;
        }
        public String toString(){
            return character+" : "+time;
        }
    }
}
